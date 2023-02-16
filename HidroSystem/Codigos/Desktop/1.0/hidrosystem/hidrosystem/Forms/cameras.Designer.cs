namespace hidrosystem.Forms
{
    partial class cameras
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.panel1 = new System.Windows.Forms.Panel();
            this.panel4 = new System.Windows.Forms.Panel();
            this.label3 = new System.Windows.Forms.Label();
            this.panel3 = new System.Windows.Forms.Panel();
            this.panel2 = new System.Windows.Forms.Panel();
            this.panel_direita = new System.Windows.Forms.Panel();
            this.label2 = new System.Windows.Forms.Label();
            this.cam_2 = new System.Windows.Forms.PictureBox();
            this.cam_1 = new System.Windows.Forms.PictureBox();
            this.label1 = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.panel4.SuspendLayout();
            this.panel_direita.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.cam_2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.cam_1)).BeginInit();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.panel1.Controls.Add(this.panel4);
            this.panel1.Controls.Add(this.panel3);
            this.panel1.Controls.Add(this.panel2);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Margin = new System.Windows.Forms.Padding(4);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(1022, 80);
            this.panel1.TabIndex = 10;
            // 
            // panel4
            // 
            this.panel4.Controls.Add(this.label3);
            this.panel4.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel4.Location = new System.Drawing.Point(275, 0);
            this.panel4.Margin = new System.Windows.Forms.Padding(4);
            this.panel4.Name = "panel4";
            this.panel4.Size = new System.Drawing.Size(439, 80);
            this.panel4.TabIndex = 2;
            // 
            // label3
            // 
            this.label3.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Left | System.Windows.Forms.AnchorStyles.Right)));
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Segoe UI", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.Color.White;
            this.label3.Location = new System.Drawing.Point(97, 24);
            this.label3.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(180, 30);
            this.label3.TabIndex = 2;
            this.label3.Text = "CAMERAS - IPTV";
            // 
            // panel3
            // 
            this.panel3.Dock = System.Windows.Forms.DockStyle.Right;
            this.panel3.Location = new System.Drawing.Point(714, 0);
            this.panel3.Margin = new System.Windows.Forms.Padding(4);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(308, 80);
            this.panel3.TabIndex = 1;
            // 
            // panel2
            // 
            this.panel2.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel2.Location = new System.Drawing.Point(0, 0);
            this.panel2.Margin = new System.Windows.Forms.Padding(4);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(275, 80);
            this.panel2.TabIndex = 0;
            // 
            // panel_direita
            // 
            this.panel_direita.Controls.Add(this.label2);
            this.panel_direita.Controls.Add(this.cam_2);
            this.panel_direita.Controls.Add(this.cam_1);
            this.panel_direita.Controls.Add(this.label1);
            this.panel_direita.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel_direita.Location = new System.Drawing.Point(0, 80);
            this.panel_direita.Name = "panel_direita";
            this.panel_direita.Size = new System.Drawing.Size(1022, 469);
            this.panel_direita.TabIndex = 11;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Segoe UI Black", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.Red;
            this.label2.Location = new System.Drawing.Point(643, 20);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(177, 37);
            this.label2.TabIndex = 4;
            this.label2.Text = "CAMERA - 2";
            // 
            // cam_2
            // 
            this.cam_2.Location = new System.Drawing.Point(516, 70);
            this.cam_2.Name = "cam_2";
            this.cam_2.Size = new System.Drawing.Size(455, 348);
            this.cam_2.TabIndex = 3;
            this.cam_2.TabStop = false;
            // 
            // cam_1
            // 
            this.cam_1.Location = new System.Drawing.Point(34, 70);
            this.cam_1.Name = "cam_1";
            this.cam_1.Size = new System.Drawing.Size(455, 348);
            this.cam_1.TabIndex = 2;
            this.cam_1.TabStop = false;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Segoe UI Black", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.Red;
            this.label1.Location = new System.Drawing.Point(165, 20);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(174, 37);
            this.label1.TabIndex = 1;
            this.label1.Text = "CAMERA - 1";
            // 
            // cameras
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1022, 549);
            this.Controls.Add(this.panel_direita);
            this.Controls.Add(this.panel1);
            this.Name = "cameras";
            this.Text = "cameras";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.cameras_Load);
            this.panel1.ResumeLayout(false);
            this.panel4.ResumeLayout(false);
            this.panel4.PerformLayout();
            this.panel_direita.ResumeLayout(false);
            this.panel_direita.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.cam_2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.cam_1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Panel panel_direita;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.PictureBox cam_2;
        private System.Windows.Forms.PictureBox cam_1;
        private System.Windows.Forms.Label label2;
    }
}