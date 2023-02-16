namespace hidrosystem.Forms
{
    partial class irc
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
            this.list_msg = new System.Windows.Forms.ListBox();
            this.panel5 = new System.Windows.Forms.Panel();
            this.lb_nick = new System.Windows.Forms.Label();
            this.btn_deconectar = new System.Windows.Forms.Button();
            this.btn_connect = new System.Windows.Forms.Button();
            this.tb_nick = new System.Windows.Forms.TextBox();
            this.panel6 = new System.Windows.Forms.Panel();
            this.btn_send = new System.Windows.Forms.Button();
            this.tb_msg = new System.Windows.Forms.TextBox();
            this.panel7 = new System.Windows.Forms.Panel();
            this.list_info = new System.Windows.Forms.ListBox();
            this.panel8 = new System.Windows.Forms.Panel();
            this.panel1.SuspendLayout();
            this.panel4.SuspendLayout();
            this.panel5.SuspendLayout();
            this.panel6.SuspendLayout();
            this.panel7.SuspendLayout();
            this.panel8.SuspendLayout();
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
            this.panel1.Size = new System.Drawing.Size(1134, 80);
            this.panel1.TabIndex = 10;
            // 
            // panel4
            // 
            this.panel4.Controls.Add(this.label3);
            this.panel4.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel4.Location = new System.Drawing.Point(275, 0);
            this.panel4.Margin = new System.Windows.Forms.Padding(4);
            this.panel4.Name = "panel4";
            this.panel4.Size = new System.Drawing.Size(583, 80);
            this.panel4.TabIndex = 2;
            // 
            // label3
            // 
            this.label3.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Left | System.Windows.Forms.AnchorStyles.Right)));
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Segoe UI", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.Color.White;
            this.label3.Location = new System.Drawing.Point(151, 25);
            this.label3.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(213, 30);
            this.label3.TabIndex = 2;
            this.label3.Text = "CHAT - HidroSystem";
            // 
            // panel3
            // 
            this.panel3.Dock = System.Windows.Forms.DockStyle.Right;
            this.panel3.Location = new System.Drawing.Point(858, 0);
            this.panel3.Margin = new System.Windows.Forms.Padding(4);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(276, 80);
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
            // list_msg
            // 
            this.list_msg.Dock = System.Windows.Forms.DockStyle.Fill;
            this.list_msg.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.list_msg.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.list_msg.FormattingEnabled = true;
            this.list_msg.ItemHeight = 18;
            this.list_msg.Location = new System.Drawing.Point(0, 0);
            this.list_msg.Name = "list_msg";
            this.list_msg.Size = new System.Drawing.Size(858, 418);
            this.list_msg.TabIndex = 12;
            // 
            // panel5
            // 
            this.panel5.Controls.Add(this.lb_nick);
            this.panel5.Controls.Add(this.btn_deconectar);
            this.panel5.Controls.Add(this.btn_connect);
            this.panel5.Controls.Add(this.tb_nick);
            this.panel5.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel5.Location = new System.Drawing.Point(0, 80);
            this.panel5.Name = "panel5";
            this.panel5.Size = new System.Drawing.Size(1134, 38);
            this.panel5.TabIndex = 13;
            // 
            // lb_nick
            // 
            this.lb_nick.AutoSize = true;
            this.lb_nick.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lb_nick.ForeColor = System.Drawing.Color.Red;
            this.lb_nick.Location = new System.Drawing.Point(12, 6);
            this.lb_nick.Name = "lb_nick";
            this.lb_nick.Size = new System.Drawing.Size(100, 25);
            this.lb_nick.TabIndex = 4;
            this.lb_nick.Text = "Usuário:";
            // 
            // btn_deconectar
            // 
            this.btn_deconectar.BackColor = System.Drawing.Color.Turquoise;
            this.btn_deconectar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btn_deconectar.Dock = System.Windows.Forms.DockStyle.Right;
            this.btn_deconectar.FlatAppearance.BorderSize = 0;
            this.btn_deconectar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_deconectar.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_deconectar.Location = new System.Drawing.Point(858, 0);
            this.btn_deconectar.Name = "btn_deconectar";
            this.btn_deconectar.Size = new System.Drawing.Size(138, 38);
            this.btn_deconectar.TabIndex = 3;
            this.btn_deconectar.Text = "Desconectar";
            this.btn_deconectar.UseVisualStyleBackColor = false;
            this.btn_deconectar.Click += new System.EventHandler(this.btn_deconectar_Click);
            // 
            // btn_connect
            // 
            this.btn_connect.BackColor = System.Drawing.Color.Turquoise;
            this.btn_connect.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btn_connect.Dock = System.Windows.Forms.DockStyle.Right;
            this.btn_connect.FlatAppearance.BorderSize = 0;
            this.btn_connect.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_connect.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_connect.Location = new System.Drawing.Point(996, 0);
            this.btn_connect.Name = "btn_connect";
            this.btn_connect.Size = new System.Drawing.Size(138, 38);
            this.btn_connect.TabIndex = 2;
            this.btn_connect.Text = "Conectar";
            this.btn_connect.UseVisualStyleBackColor = false;
            this.btn_connect.Click += new System.EventHandler(this.btn_connect_Click);
            // 
            // tb_nick
            // 
            this.tb_nick.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tb_nick.Location = new System.Drawing.Point(128, 7);
            this.tb_nick.Name = "tb_nick";
            this.tb_nick.Size = new System.Drawing.Size(263, 24);
            this.tb_nick.TabIndex = 0;
            // 
            // panel6
            // 
            this.panel6.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.panel6.Controls.Add(this.btn_send);
            this.panel6.Controls.Add(this.tb_msg);
            this.panel6.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel6.Location = new System.Drawing.Point(0, 536);
            this.panel6.Name = "panel6";
            this.panel6.Size = new System.Drawing.Size(1134, 49);
            this.panel6.TabIndex = 14;
            // 
            // btn_send
            // 
            this.btn_send.BackColor = System.Drawing.Color.Turquoise;
            this.btn_send.FlatAppearance.BorderSize = 0;
            this.btn_send.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_send.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_send.Location = new System.Drawing.Point(924, 7);
            this.btn_send.Name = "btn_send";
            this.btn_send.Size = new System.Drawing.Size(138, 39);
            this.btn_send.TabIndex = 1;
            this.btn_send.Text = "Enviar Mensagem";
            this.btn_send.UseVisualStyleBackColor = false;
            this.btn_send.Click += new System.EventHandler(this.btn_send_Click);
            // 
            // tb_msg
            // 
            this.tb_msg.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tb_msg.Location = new System.Drawing.Point(7, 9);
            this.tb_msg.Name = "tb_msg";
            this.tb_msg.Size = new System.Drawing.Size(889, 33);
            this.tb_msg.TabIndex = 0;
            // 
            // panel7
            // 
            this.panel7.Controls.Add(this.list_info);
            this.panel7.Dock = System.Windows.Forms.DockStyle.Right;
            this.panel7.Location = new System.Drawing.Point(858, 118);
            this.panel7.Name = "panel7";
            this.panel7.Size = new System.Drawing.Size(276, 418);
            this.panel7.TabIndex = 15;
            // 
            // list_info
            // 
            this.list_info.Dock = System.Windows.Forms.DockStyle.Fill;
            this.list_info.ForeColor = System.Drawing.Color.Red;
            this.list_info.FormattingEnabled = true;
            this.list_info.Location = new System.Drawing.Point(0, 0);
            this.list_info.Name = "list_info";
            this.list_info.Size = new System.Drawing.Size(276, 418);
            this.list_info.TabIndex = 0;
            // 
            // panel8
            // 
            this.panel8.Controls.Add(this.list_msg);
            this.panel8.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel8.Location = new System.Drawing.Point(0, 118);
            this.panel8.Name = "panel8";
            this.panel8.Size = new System.Drawing.Size(858, 418);
            this.panel8.TabIndex = 16;
            // 
            // irc
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1134, 585);
            this.Controls.Add(this.panel8);
            this.Controls.Add(this.panel7);
            this.Controls.Add(this.panel6);
            this.Controls.Add(this.panel5);
            this.Controls.Add(this.panel1);
            this.KeyPreview = true;
            this.Name = "irc";
            this.Text = "irc";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.irc_FormClosing);
            this.FormClosed += new System.Windows.Forms.FormClosedEventHandler(this.irc_FormClosed);
            this.Load += new System.EventHandler(this.irc_Load);
            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.irc_KeyDown);
            this.panel1.ResumeLayout(false);
            this.panel4.ResumeLayout(false);
            this.panel4.PerformLayout();
            this.panel5.ResumeLayout(false);
            this.panel5.PerformLayout();
            this.panel6.ResumeLayout(false);
            this.panel6.PerformLayout();
            this.panel7.ResumeLayout(false);
            this.panel8.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.ListBox list_msg;
        private System.Windows.Forms.Panel panel5;
        private System.Windows.Forms.Panel panel6;
        private System.Windows.Forms.TextBox tb_nick;
        private System.Windows.Forms.Panel panel7;
        private System.Windows.Forms.ListBox list_info;
        private System.Windows.Forms.Button btn_send;
        private System.Windows.Forms.TextBox tb_msg;
        private System.Windows.Forms.Button btn_connect;
        private System.Windows.Forms.Button btn_deconectar;
        private System.Windows.Forms.Panel panel8;
        private System.Windows.Forms.Label lb_nick;
    }
}