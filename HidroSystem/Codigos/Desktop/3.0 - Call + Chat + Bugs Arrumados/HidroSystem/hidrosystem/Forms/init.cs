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
    public partial class init : Form
    {
        public init()
        {
            InitializeComponent();
        }
        
        private void init_Load(object sender, EventArgs e)
        {
            string html = "<html><head>";
            html += "<meta content='IE=Edge' http-equiv='X-UA-Compatible'/>";
            html += "<center><iframe id='video' src='https://drive.google.com/file/d/12w27JrrAd8kBjx9aqsqjIf3NqzTc60Wm/preview' width='814' height='429' frameborder='0' allowfullscreen='true'></iframe></center>";
            html += "</body></html>";
            //web_video.Navigate("https://www.youtube.com/embed/scB_Uc1hxCk");
            // web_video.DocumentText = "<html>< head >< meta content = 'IE-Edge http-equiv='X - UA - Compatible'/></ head >< body >";
            web_video.DocumentText = html;
          
        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            //Bruno
            string link = "https://linktr.ee/cyber_root";
            System.Diagnostics.Process pStart = new System.Diagnostics.Process();
            pStart.StartInfo = new System.Diagnostics.ProcessStartInfo(@"" + link);
            pStart.Start();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            //Cristian
            string link = "https://linktr.ee/Cristian_Negrizolli";
            System.Diagnostics.Process pStart = new System.Diagnostics.Process();
            pStart.StartInfo = new System.Diagnostics.ProcessStartInfo(@"" + link);
            pStart.Start();
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            //Thiago
            
            string link = "https://linktr.ee/Thiago_Batista";
            System.Diagnostics.Process pStart = new System.Diagnostics.Process();
            pStart.StartInfo = new System.Diagnostics.ProcessStartInfo(@"" + link);
            pStart.Start();
        }

        private void pictureBox4_Click(object sender, EventArgs e)
        {
            //website
            string link = "http://hidrosystem1.000webhostapp.com";
            System.Diagnostics.Process pStart = new System.Diagnostics.Process();
            pStart.StartInfo = new System.Diagnostics.ProcessStartInfo(@"" + link);
            pStart.Start();
        }
    }
}
