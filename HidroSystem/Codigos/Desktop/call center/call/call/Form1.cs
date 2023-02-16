using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Ozeki.Media;
using Ozeki.VoIP;
using System.IO;
using System.Threading;
using System.Media;
using System.Speech.Synthesis;



namespace call
{
    public partial class Form1 : Form
    {
        static ISoftPhone _softphone;   // softphone object
        static IPhoneLine _phoneLine;   // phoneline object
        static IPhoneCall _call;
        static Speaker _speaker;
        static MediaConnector _connector;
        static PhoneCallAudioReceiver _mediaReceiver;
        static Microphone microphone;
        static PhoneCallAudioSender mediaSender;
        static string user0;
        SpeechSynthesizer sintetizador = new SpeechSynthesizer();


        public Form1()
        {
            InitializeComponent();
        }

        //registro de "Tunel para Efetuar a ligação VOIP"
        static void RegisterAccount(SIPAccount account)
        {
            try
            {
                _phoneLine = _softphone.CreatePhoneLine(account);
                _phoneLine.RegistrationStateChanged += line_RegStateChanged;
                _softphone.RegisterPhoneLine(_phoneLine);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error during SIP registration: " + ex.Message);
            }
        }
        //
        static void line_RegStateChanged(object sender, RegistrationStateChangedArgs e)
        {
            if (e.State == RegState.NotRegistered || e.State == RegState.Error)
                Console.WriteLine("Registration failed!");

            if (e.State == RegState.RegistrationSucceeded)
            {
                MessageBox.Show("Registration succeeded - Online!");
               
                CreateCall();
            }
        }

        private static void CreateCall()
        {
            var numberToDial = "admin0070";
            _call = _softphone.CreateCallObject(_phoneLine, numberToDial);
            _call.CallStateChanged += call_CallStateChanged;
            _call.Start();
            
           
            
        }

        private static void SetupSpeaker()
        {
            _connector.Connect(_mediaReceiver, _speaker);
            _mediaReceiver.AttachToCall(_call);

            _speaker.Start();
            MessageBox.Show("The speaker is functioning.");
        }

        static void call_CallStateChanged(object sender, CallStateChangedArgs e)
        {
            //Console.WriteLine("Call state: {0}.", e.State);
           
            if (e.State == CallState.Answered)
                SetupSpeaker();
                SetupMicrophone();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            sintetizador.Speak("Bem Vindo Ao CallCenter HidroSystem!");
           
            
         



        }

        static void SetupMicrophone()
        {
            _connector.Connect(microphone, mediaSender);
            mediaSender.AttachToCall(_call);

            microphone.Start();

            Console.WriteLine("The microphone is functioning.");
        }

        private void button1_Click(object sender, EventArgs e)
        {
           
        }

        private void btn_sair_Click(object sender, EventArgs e)
        {
            try
            {
                _call.HangUp();
            }
            catch
            {
                sintetizador.Speak("Não Existe Chamada em Andamento");
            }
           
        }

        private void cb_admins_SelectedIndexChanged(object sender, EventArgs e)
        {

            if (cb_admins.Text == "Bruno")
            {
                img_admin.BackgroundImage = call.Properties.Resources.download;
                lb_user.Text = "Bruno";
                sintetizador.Speak("Ligação em Andamento para Bruno!");
            }
            if (cb_admins.Text == "Cristian")
            {
                img_admin.BackgroundImage = call.Properties.Resources.male_user_28px;
                lb_user.Text = "Cristian";
                sintetizador.Speak("Ligação em Andamento para Cristian!");
            }
            if (cb_admins.Text == "Thiago")
            {
                img_admin.BackgroundImage = call.Properties.Resources.male_user_28px;
                lb_user.Text = "Thiago";
                sintetizador.Speak("Ligação em Andamento para Thiago!");
            }


        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (cb_admins.Text == "")
            {
                MessageBox.Show("Selecione o Contato!");
                cb_admins.Focus();

            }
            else
            {
                //setando as variaveis de configuração
                if (cb_admins.Text == "Bruno")
                {
                    user0 = "admin0070";
                  
                }
                else if (cb_admins.Text == "Thiago")
                {
                    user0 = "thiago0070";
                }
                else if (cb_admins.Text == "Cristian")
                {
                    user0 = "cristian0070";
                }

                //iniciando o sistema
                // Create a softphone object with RTP port range 5000 - 10000
                var userAgent = "Speaker-HidroSystem";
                _softphone = SoftPhoneFactory.CreateSoftPhone(5000, 10000, userAgent);

                // SIP account registration data, (supplied by your VoIP service provider)
                var registrationRequired = true;
                var userName = "hidrosystem1";
                var displayName = "hidrosystem1";
                var authenticationId = "hidrosystem1";
                var registerPassword = "136790Ab.";
                var domainHost = "sip.linphone.org";
                var domainPort = 5060;

                var account = new SIPAccount(registrationRequired, displayName, userName, authenticationId, registerPassword, domainHost, domainPort);

                // Send SIP regitration request
                RegisterAccount(account);
                //enviando o audio
                microphone = Microphone.GetDefaultDevice();
                mediaSender = new PhoneCallAudioSender();

                _speaker = Speaker.GetDefaultDevice();
                _mediaReceiver = new PhoneCallAudioReceiver();
                _connector = new MediaConnector();



            }
        }

        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            try
            {
                _call.HangUp();
            }
            catch
            {

            }
            
        }
    }
}
