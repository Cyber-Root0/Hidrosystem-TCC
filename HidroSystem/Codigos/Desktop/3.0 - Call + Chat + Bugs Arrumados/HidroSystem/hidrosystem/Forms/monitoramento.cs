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
    public partial class monitoramento : Form
    {
        public monitoramento()
        {
            InitializeComponent();
        }

        private void timer_atualizacao_Tick(object sender, EventArgs e)
        {
            //chamando a função pra fazer a atualização dos dados no sistema...
            if (hidrosystem.dados.panel == true)
            {
                atualizacao();
            }
            else
            {
                timer_atualizacao.Enabled = false;
                timer_atualizacao.Stop();
            }
           
        }

        //variaveis globais no sistema
        public string responseFromServer;
        public void atualizacao()
        {
            
            //fazendo o processo de validação com coneção com o servidor
            try
            {
                HttpWebRequest request = (HttpWebRequest)WebRequest.Create("https://hidrosystem1.000webhostapp.com/apis/info/now.php");
                request.Method = "POST";
                request.Credentials = CredentialCache.DefaultCredentials;
                ((HttpWebRequest)request).UserAgent = "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 7.1; Trident/5.0)";
                request.Accept = "/";
                request.UseDefaultCredentials = true;
                request.Proxy.Credentials = System.Net.CredentialCache.DefaultCredentials;
                byte[] byteArray = Encoding.UTF8.GetBytes("token=" + hidrosystem.dados.token);
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
                var data = Newtonsoft.Json.JsonConvert.DeserializeObject<realtime>(nova);
                
                if (data.id != null)
                {
                    //processo de jogar os dados dentro das labels no software
                    label_id.Text = data.id;
                    label_arduino.Text = data.arduino;
                    label_temp.Text = data.temperatura;
                    label_ph.Text = data.ph;
                    label_hora.Text = data.hora;

                }
                else
                {
                   
                }
                



            }
            catch(Exception e)
            {
                MessageBox.Show(e.Message);
            }




        }
        public class realtime
        {
            public string id { get; set; }
            public string arduino { get; set; }
            public string temperatura { get; set; }
            public string ph  { get; set; }
            public string hora { get; set; }

        }

        private void monitoramento_Load(object sender, EventArgs e)
        {
            atualizacao();
        }

        private void monitoramento_FormClosing(object sender, FormClosingEventArgs e)
        {
            timer_atualizacao.Stop();
            timer_atualizacao.Enabled = false;
        }
    }
}
