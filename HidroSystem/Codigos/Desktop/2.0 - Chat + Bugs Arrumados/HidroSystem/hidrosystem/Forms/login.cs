using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Threading;
using Newtonsoft.Json;
using System.Net.Http.Headers;
using System.Net;
using System.IO;
using System.Security.Cryptography;


namespace hidrosystem.Forms
{
    public partial class login : Form
    {
        Thread t1;
        public login()
        {
            
            InitializeComponent();
        }

        private void btn_login_Click(object sender, EventArgs e)
        {
           if(tb_user.Text=="" || tb_pass.Text == "")
            {
                MessageBox.Show("PREENCHA OS CAMPOS");

            }
            else
            {
                string user = tb_user.Text;
                string pass = tb_pass.Text;
                string responseFromServer;
                //fazendo o processo de validação com coneção com o servidor

                HttpWebRequest request = (HttpWebRequest)WebRequest.Create("https://hidrosystem1.000webhostapp.com/apis/auth/index.php");
                request.Method = "POST";
                request.Credentials = CredentialCache.DefaultCredentials;
                ((HttpWebRequest)request).UserAgent = "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 7.1; Trident/5.0)";
                request.Accept = "/";
                request.UseDefaultCredentials = true;
                request.Proxy.Credentials = System.Net.CredentialCache.DefaultCredentials;
                byte[] byteArray = Encoding.UTF8.GetBytes("user="+user+"&pass="+pass);
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
                // processo de tratamento do Output Json no caso
                string nova = responseFromServer.Replace("\"", "\'");
                dados my = JsonConvert.DeserializeObject<dados>(nova);
                if (my.cod == 200)
                {
                    //chamando a função para armazenar o token no txt....
                    set_token(my.info["token"], my.info["user"], my.info["id"], my.info["name"]);

                    //armazenando o token na classe
                    hidrosystem.dados.id = my.info["id"];
                    hidrosystem.dados.token = my.info["token"];
                    hidrosystem.dados.user = my.info["user"];
                    hidrosystem.dados.nome = my.info["name"];
                    //redirecionando o usuario para outra tela...
                    MessageBox.Show("Bem vindo "+my.info["name"]+"!\n Logado com Sucesso");
                    this.Close();
                    t1 = new Thread(abrirjanela);
                    t1.SetApartmentState(ApartmentState.STA);
                    t1.Start();
                }
                else
                {
                    MessageBox.Show("Logim Mal Sucedido!");
                    tb_pass.Text = "";
                    tb_user.Text = "";
                    tb_user.Focus();

                }

           
             
            }

           
        }
        //procedure para armazenar as info e o token em um txt/csv
        public void set_token(string token,string user,string Id, string name)
        {
            //processo de criar / Abrir um txt para armazenar o token
            File.Delete("info.csv");
            StreamWriter file = new StreamWriter("info.csv");
            file.Write(Id+","+user+","+token+","+name);
            file.Close();

        }

        //classe para pegar os dados

        public class dados
        {

            public int cod { get; set; }
            public string msg { get; set; }
            public string login { get; set; }
            public SortedList<string, string> info { get; set; }
            //Dictionary<string,string> info{ get; set; }


        }


        private void abrirjanela(object obj)
        {
            Application.Run(new home());
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
        
        public static bool valida_token(string token)
        {
            //realizando uma requisição metodo post pra fazer a validação do token...
            string responseFromServer;
            //fazendo o processo de validação com coneção com o servidor
            try
            {

                HttpWebRequest request = (HttpWebRequest)WebRequest.Create("https://hidrosystem1.000webhostapp.com/apis/auth/auth.php");
                request.Method = "POST";
                request.Credentials = CredentialCache.DefaultCredentials;
                ((HttpWebRequest)request).UserAgent = "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 7.1; Trident/5.0)";
                request.Accept = "/";
                request.UseDefaultCredentials = true;
                request.Proxy.Credentials = System.Net.CredentialCache.DefaultCredentials;
                byte[] byteArray = Encoding.UTF8.GetBytes("token=" + token);
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
                // processo de tratamento do Output Json no caso
                string nova = responseFromServer.Replace("\"", "\'");
                dados my = JsonConvert.DeserializeObject<dados>(nova);
                if (my.cod != 200)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
            catch
            {
                return false;
            }
           
        




        }

        private void login_Load(object sender, EventArgs e)
        {
            //verificando se existe um arquivo de LOGIN, caso exista...VAI REalizar a validação do token
            string arquivo = @"info.csv";

            if (File.Exists(arquivo))
            {
                
                StreamReader file = new StreamReader(arquivo);
                string linha = file.ReadLine();
                file.Close();
                if (linha != null)
                {
                    string[] dado = linha.Split(',');
                    bool status=valida_token(dado[2]);
                    if (status == true)
                    {
                        //setando as variaveis na classe
                        hidrosystem.dados.id = dado[0];
                        hidrosystem.dados.user = dado[1];
                        hidrosystem.dados.token = dado[2];
                        hidrosystem.dados.nome = dado[3];
                        //processo de abertura da outra pagina
                        this.Close();
                        t1 = new Thread(abrirjanela);
                        t1.SetApartmentState(ApartmentState.STA);
                        t1.Start();
                    }
                   
                   
                }

            }
            else
            {
                MessageBox.Show("Faça o Login para Entrar no Sistema");
            }
        

        }

        private void label3_Click(object sender, EventArgs e)
        {
            //website cadastro
            string link = "http://hidrosystem1.000webhostapp.com/cadastro.php";
            System.Diagnostics.Process pStart = new System.Diagnostics.Process();
            pStart.StartInfo = new System.Diagnostics.ProcessStartInfo(@"" + link);
            pStart.Start();
        }

        private void label4_Click(object sender, EventArgs e)
        {
            string link = "http://hidrosystem1.000webhostapp.com/recuperar.php";
            System.Diagnostics.Process pStart = new System.Diagnostics.Process();
            pStart.StartInfo = new System.Diagnostics.ProcessStartInfo(@"" + link);
            pStart.Start();

        }
    }
}
