using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.Net.Http.Headers;
using System.Net;
using System.IO;

namespace hidrosystem.Forms
{
    public partial class alertas : Form
    {
        public alertas()
        {
            InitializeComponent();
        }

        private void alertas_Load(object sender, EventArgs e)
        {
            grid_alertas.Columns[2].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
          //  grid_alertas.Columns[1].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            //grid_alertas.Columns[2].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            //grid_alertas.Columns[3].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            //grid_alertas.Columns[4].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;



            grid_alertas.BorderStyle = BorderStyle.None;
            grid_alertas.AlternatingRowsDefaultCellStyle.BackColor = Color.FromArgb(238, 239, 249);
            grid_alertas.CellBorderStyle = DataGridViewCellBorderStyle.SingleHorizontal;
            grid_alertas.DefaultCellStyle.SelectionBackColor = Color.DarkTurquoise;
            grid_alertas.DefaultCellStyle.SelectionForeColor = Color.WhiteSmoke;
            grid_alertas.BackgroundColor = Color.White;

            grid_alertas.EnableHeadersVisualStyles = false;
            grid_alertas.ColumnHeadersBorderStyle = DataGridViewHeaderBorderStyle.None;
            grid_alertas.ColumnHeadersDefaultCellStyle.BackColor = Color.FromArgb(20, 25, 72);
            grid_alertas.ColumnHeadersDefaultCellStyle.ForeColor = Color.White;
            preenchegrid();


        }
        public string responseFromServer;
        private void preenchegrid()
        {
            
            //fazendo o processo de validação com coneção com o servidor
            try
            {
                HttpWebRequest request = (HttpWebRequest)WebRequest.Create("http://hidrosystem1.000webhostapp.com/apis/info/alerta.php");
                request.Method = "POST";
                request.Credentials = CredentialCache.DefaultCredentials;
                ((HttpWebRequest)request).UserAgent = "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 7.1; Trident/5.0)";
                request.Accept = "/";
                request.UseDefaultCredentials = true;
                request.Proxy.Credentials = System.Net.CredentialCache.DefaultCredentials;
                byte[] byteArray = Encoding.UTF8.GetBytes("token="+hidrosystem.dados.token);
                request.ContentType = "application/x-www-form-urlencoded";
                request.ContentLength = byteArray.Length;
                Stream dataStream = request.GetRequestStream();
                dataStream.Write(byteArray, 0, byteArray.Length);
                dataStream.Close();

                WebResponse response = request.GetResponse();
                dataStream = response.GetResponseStream();
                StreamReader reader = new StreamReader(dataStream);
                responseFromServer = reader.ReadToEnd();
                reader.Close();
                dataStream.Close();
                response.Close();
                //processo de tratamento da string para Converter em JSON
                string nova = responseFromServer.Replace("\"", "\'");
               
                //converter a string JSON em um OBJETO C#
                var data = Newtonsoft.Json.JsonConvert.DeserializeObject<infoa>(nova);
                //fazendo a validação do token que esta sendo enviado por meio do cod status do json
                if (data.cod == 200)
                {
                    for (int i = 0; i < data.info.Count(); i++)
                    {
                        var index = grid_alertas.Rows.Add();
                        grid_alertas.Rows[index].Cells["ID"].Value = data.info[i].id;
                        grid_alertas.Rows[index].Cells["ARDUINO"].Value = data.info[i].arduino;
                        grid_alertas.Rows[index].Cells["MENSAGEM"].Value = data.info[i].mensagem;
                        grid_alertas.Rows[index].Cells["HORA"].Value = data.info[i].hora;
                        grid_alertas.Rows[index].Cells["DATA"].Value = data.info[i].data;
                    }
                    //exibindo na label a quantidade de registros encontrados...
                    lb_qtdcli.Text = "Foram Encontrados " + grid_alertas.Rows.Count + " Alertas!";


                }
                else
                {
                    MessageBox.Show("Nenhum Alerta Encontrado!");
                    

                }



            }
            catch
            {
                MessageBox.Show("Problemas com Conexão a Internet");
            }
            
         

             
        }
        //classes essencias para o sistema
        public class infoa
        {
            public int cod { get; set; }
            public dados[] info { get; set; }
            
        }
        public class dados
        {
            public string id { get; set; }
            public string arduino { get; set; }
            public string mensagem { get; set; }
            public string hora { get; set; }
            public string data { get; set; }

        }


    }
   

}
