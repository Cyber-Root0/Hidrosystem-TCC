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
using System.Media;

namespace hidrosystem
{
    public partial class Form1 : Form
    {
        Thread t1;
        public Form1()
        {
            InitializeComponent();
        }

        private void timer_Tick(object sender, EventArgs e)
        {
            if (panel_list.Width >= 599)
            {
                timer.Enabled = false;
                this.Close();
                t1 = new Thread(abrirjanela);
                t1.SetApartmentState(ApartmentState.STA);
                t1.Start();
            }
            else
            {
                panel_list.Width += 6;



            }



        }

        private void abrirjanela(object obj)
        {
            Application.Run(new Forms.login());
        }


    }
}
