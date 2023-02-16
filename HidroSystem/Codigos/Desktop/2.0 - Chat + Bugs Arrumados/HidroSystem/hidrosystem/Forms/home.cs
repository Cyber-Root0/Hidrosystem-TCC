using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace hidrosystem.Forms
{
 
    public partial class home : Form
    {
        private Form OpenForm;
        public home()
        {
           
            InitializeComponent();
        }

        
       


        private void btn_exitform_Click(object sender, EventArgs e)
        {
            foreach (Control c in panel_forms.Controls.OfType<Control>().Reverse())
            {
                if (c is Control)
                {
                    panel_forms.Controls.Remove(c);
                }
            }


            //configurações do layout
            hidrosystem.dados.panel = false;
            btn_exitform.Visible = false;


            //processo de fechamento e abertura do Formulario
            OpenForm?.Close();
            OpenForm = new Forms.init
            {
                TopLevel = false,
                FormBorderStyle = FormBorderStyle.None


            };
            panel_forms.Controls.Add(OpenForm);
            OpenForm.Show();
        }

        private void btn_init_Click(object sender, EventArgs e)
        {
            foreach (Control c in panel_forms.Controls.OfType<Control>().Reverse())
            {
                if (c is Control)
                {
                    panel_forms.Controls.Remove(c);
                }
            }

            hidrosystem.dados.panel = false;
            //processo de abertura do formulario dentro do Panel
            //processo de fechamento e abertura do Formulario
            OpenForm?.Close();
            OpenForm = new Forms.init
            {
                TopLevel = false,
                FormBorderStyle = FormBorderStyle.None


            };
            panel_forms.Controls.Add(OpenForm);
            OpenForm.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            foreach (Control c in panel_forms.Controls.OfType<Control>().Reverse())
            {
                if (c is Control)
                {
                    panel_forms.Controls.Remove(c);
                }
            }

            hidrosystem.dados.panel = false;
            //processo de abertura do formulario dentro do panel
            //processo de fechamento e abertura do Formulario
            OpenForm?.Close();
            OpenForm = new Forms.alertas
            {
                TopLevel = false,
                FormBorderStyle = FormBorderStyle.None


            };
            panel_forms.Controls.Add(OpenForm);
            OpenForm.Show();

            btn_exitform.Visible = true;
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            Forms.myinfo info = new Forms.myinfo();
            info.ShowDialog();
        }

        private void home_Load(object sender, EventArgs e)
        {
            hidrosystem.dados.panel = false;
            lb_nome.Text = hidrosystem.dados.nome;

            //processo de fechamento e abertura do Formulario
            OpenForm?.Close();
            OpenForm = new Forms.init
            {
                TopLevel = false,
                FormBorderStyle = FormBorderStyle.None


            };
            panel_forms.Controls.Add(OpenForm);
            OpenForm.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {

            foreach (Control c in panel_forms.Controls.OfType<Control>().Reverse())
            {
                if (c is Control)
                {
                    panel_forms.Controls.Remove(c);
                }
            }

            hidrosystem.dados.panel = false;
            //processo de abertura do formulario dentro do panel
            //processo de fechamento e abertura do Formulario
            OpenForm?.Close();
            OpenForm = new Forms.relatorio
            {
                TopLevel = false,
                FormBorderStyle = FormBorderStyle.None


            };
            panel_forms.Controls.Add(OpenForm);
            OpenForm.Show();


            btn_exitform.Visible = true;
           


        }

        private void button1_Click(object sender, EventArgs e)
        {

            hidrosystem.dados.panel = true;

            //processo de abertura do formulario dentro do panel

            //processo de fechamento e abertura do Formulario
            OpenForm?.Close();
            OpenForm = new Forms.monitoramento
            {
                TopLevel = false,
                FormBorderStyle = FormBorderStyle.None


            };
            panel_forms.Controls.Add(OpenForm);
            OpenForm.Show();



            btn_exitform.Visible = true;
            

        }

        private void button4_Click(object sender, EventArgs e)
        {
            hidrosystem.dados.panel = false;
            //processo de abertura do formulario dentro do panel
            //processo de fechamento e abertura do Formulario
            OpenForm?.Close();
            OpenForm = new Forms.irc
            {
                TopLevel = false,
                FormBorderStyle = FormBorderStyle.None


            };
            panel_forms.Controls.Add(OpenForm);
            OpenForm.Show();

            btn_exitform.Visible = true;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            //botao do formulario das cameras de segurança
            hidrosystem.dados.panel = false;
            //processo de abertura do formulario dentro do panel
            //processo de fechamento e abertura do Formulario
            OpenForm?.Close();
            OpenForm = new Forms.cameras
            {
                TopLevel = false,
                FormBorderStyle = FormBorderStyle.None


            };
            panel_forms.Controls.Add(OpenForm);
            OpenForm.Show();

            btn_exitform.Visible = true;
        }
    }
}
