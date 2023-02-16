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

            hidrosystem.dados.panel = false;
            panel_forms.Controls.Clear();
            btn_exitform.Visible = false;
            Forms.init home = new Forms.init();
            home.TopLevel = false;
            panel_forms.Controls.Add(home);
            home.FormBorderStyle = FormBorderStyle.None;
            home.Show();
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
            panel_forms.Controls.Clear();
           Forms.init home = new Forms.init();
            home.TopLevel = false;
            panel_forms.Controls.Add(home);
            home.FormBorderStyle = FormBorderStyle.None;
            home.Show();
      
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
            panel_forms.Controls.Clear();
           Forms.alertas home = new Forms.alertas();
            home.TopLevel = false;
            panel_forms.Controls.Add(home);
            home.FormBorderStyle = FormBorderStyle.None;
            home.Show();
            btn_exitform.Visible = true;
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            Forms.myinfo info = new Forms.myinfo();
            info.ShowDialog();
        }

        private void home_Load(object sender, EventArgs e)
        {
            foreach (Control c in panel_forms.Controls.OfType<Control>().Reverse())
            {
                if (c is Control)
                {
                    panel_forms.Controls.Remove(c);
                }
            }
            hidrosystem.dados.panel = false;
            lb_nome.Text = hidrosystem.dados.nome;
            panel_forms.Controls.Clear();
           Forms.init home = new Forms.init();
            home.TopLevel = false;
            panel_forms.Controls.Add(home);
            home.FormBorderStyle = FormBorderStyle.None;
            home.Show();
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
            panel_forms.Controls.Clear();
           Forms.relatorio home = new Forms.relatorio();
            home.TopLevel = false;
            panel_forms.Controls.Add(home);
            home.FormBorderStyle = FormBorderStyle.None;
            home.Show();
            btn_exitform.Visible = true;
           


        }

        private void button1_Click(object sender, EventArgs e)
        {

            hidrosystem.dados.panel = true;

            //processo de abertura do formulario dentro do panel
            panel_forms.Controls.Clear();
            Forms.monitoramento home = new Forms.monitoramento();
            home.TopLevel = false;
            panel_forms.Controls.Add(home);
            home.FormBorderStyle = FormBorderStyle.None;
            home.Show();
            btn_exitform.Visible = true;
            

        }

        private void button4_Click(object sender, EventArgs e)
        {
            hidrosystem.dados.panel = false;
            //processo de abertura do formulario dentro do panel
            panel_forms.Controls.Clear();
            Forms.irc home = new Forms.irc();
            home.TopLevel = false;
            panel_forms.Controls.Add(home);
            home.FormBorderStyle = FormBorderStyle.None;
            home.Show();
            btn_exitform.Visible = true;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            //botao do formulario das cameras de segurança
            hidrosystem.dados.panel = false;
            //processo de abertura do formulario dentro do panel
            panel_forms.Controls.Clear();
            Forms.cameras home = new Forms.cameras();
            home.TopLevel = false;
            panel_forms.Controls.Add(home);
            home.FormBorderStyle = FormBorderStyle.None;
            home.Show();
            btn_exitform.Visible = true;
        }
    }
}
