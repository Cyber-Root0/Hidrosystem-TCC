using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using SimpleIRCLib;
using System.Speech.Synthesis;

namespace hidrosystem.Forms
{
    public partial class irc : Form
    {
        //variaveis de configuração 
        private int port = 6667;
        SimpleIRC ircc = new SimpleIRC();
        //objeto pra converter text em voz
        SpeechSynthesizer sintetizador = new SpeechSynthesizer();

        public irc()
        {
            InitializeComponent();
        }

        private void irc_Load(object sender, EventArgs e)
        {
            tb_nick.Text = hidrosystem.dados.nome + hidrosystem.dados.id;
            tb_nick.Enabled = false;
         
        }
        int contador = 0;
        public void writeToOutput(string user, string message)
        {
            if (list_msg.Items.Count > 22)
            {
                list_msg.Items.Clear();
                list_msg.Items.Add("A Caixa de mensagens foi limpa com exito");
            }
            list_msg.Invoke(new Action(() => list_msg.Items.Add(user + ": " + message)));

            if (contador == 0)
            {
                list_msg.Items.Remove(1);
                contador++;
            }
            else
            {
                string msg = user + " Disse: " + message;
                sintetizador.Speak(msg);
                
            }
            

           

        }


        public void writeToDebugOut(string input)
        {
            if (list_info.Items.Count > 22)
            {
                list_msg.Items.Clear();
                list_msg.Items.Add("A Caixa de mensagens foi limpa com exito");
            }
            list_info.Invoke(new Action(() => list_info.Items.Add(input)));

        }

        public void downloadUpdate()
        {



        }

        private void btn_send_Click(object sender, EventArgs e)
        {
            if (ircc.isClientRunning())
            {
                ircc.sendMessage(tb_msg.Text);
                tb_msg.Text = "";
                tb_msg.Focus();
                if (list_msg.Items.Count > 22)
                {
                    list_msg.Items.Clear();
                    list_msg.Items.Add("A Caixa de mensagens foi limpa com exito");
                }
            }
            else
            {
                list_info.Items.Add("Nao Conectado ao Server");
            }
        }

        private void btn_connect_Click(object sender, EventArgs e)
        {
            if (tb_nick.Text != null)
            {
                //processo de pegar as string e colocar no sistema
                string user = tb_nick.Text;

                ircc.setupIrc("irc.libera.chat", port, user, "", "#hidrosystem", writeToOutput);
                
                ircc.setDebugCallback(writeToDebugOut);
                ircc.startClient();
                if (ircc.isClientRunning())
                {
                    tb_nick.Enabled = false;
                }

            }
            else
            {
                MessageBox.Show("Digite um Usuario!");
            }
            
        }

        private void btn_deconectar_Click(object sender, EventArgs e)
        {
            if (ircc.isClientRunning())
            {
                ircc.stopClient();
                MessageBox.Show("Desconectado do chat com Sucesso");
                contador = 0;
                tb_nick.Enabled = true;
            }
            else
            {
                MessageBox.Show("Não há conexão nenhuma");
            }

        }

        private void irc_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (ircc.isClientRunning())
            {
                ircc.stopClient();
            }
        }

        private void irc_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                if (ircc.isClientRunning())
                {
                    ircc.sendMessage(tb_msg.Text);
                    tb_msg.Text = "";
                    tb_msg.Focus();
                    if (list_msg.Items.Count> 22)
                    {
                        list_msg.Items.Clear();
                        list_msg.Items.Add("A Caixa de mensagens foi limpa com exito");
                    }
                }
                else
                {
                    list_info.Items.Add("Nao Conectado ao Server");
                }


            }
        }
    }
}
