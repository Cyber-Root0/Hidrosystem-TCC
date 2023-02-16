using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MjpegProcessor;

namespace hidrosystem.Forms
{
    public partial class cameras : Form
    {
        MjpegDecoder mjpg;
        MjpegDecoder image2;
       
        public cameras()
        {
            InitializeComponent();
            //camera 1
            mjpg = new MjpegDecoder();
            mjpg.FrameReady += mjpg_FrameReady;
            //camera 2
            image2 = new MjpegDecoder();
            image2.FrameReady += image2_FrameReady;
        }

        private void image2_FrameReady(object sender, FrameReadyEventArgs e)
        {
            cam_2.Image = e.Bitmap;
        }

        private void mjpg_FrameReady(object sender, FrameReadyEventArgs e)
        {
            cam_1.Image = e.Bitmap;
        }

        private void cameras_Load(object sender, EventArgs e)
        {

            mjpg.ParseStream(new Uri("http://187.19.204.20/mjpg/video.mjpg"));
            image2.ParseStream(new Uri("http://187.19.166.182/mjpg/video.mjpg"));
            
      
   
        }
    }
}
