namespace hidrosystem.Forms
{
    partial class home
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(home));
            this.panel_botoes = new System.Windows.Forms.Panel();
            this.panel_topo = new System.Windows.Forms.Panel();
            this.panel1 = new System.Windows.Forms.Panel();
            this.lb_nome = new System.Windows.Forms.Label();
            this.btn_exitform = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.panel_forms = new System.Windows.Forms.Panel();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.button5 = new System.Windows.Forms.Button();
            this.button4 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.btn_init = new System.Windows.Forms.Button();
            this.image_logo = new System.Windows.Forms.PictureBox();
            this.panel_botoes.SuspendLayout();
            this.panel_topo.SuspendLayout();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.image_logo)).BeginInit();
            this.SuspendLayout();
            // 
            // panel_botoes
            // 
            this.panel_botoes.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(15)))), ((int)(((byte)(20)))), ((int)(((byte)(60)))));
            this.panel_botoes.Controls.Add(this.button4);
            this.panel_botoes.Controls.Add(this.button5);
            this.panel_botoes.Controls.Add(this.button3);
            this.panel_botoes.Controls.Add(this.button2);
            this.panel_botoes.Controls.Add(this.button1);
            this.panel_botoes.Controls.Add(this.btn_init);
            this.panel_botoes.Controls.Add(this.image_logo);
            this.panel_botoes.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel_botoes.Location = new System.Drawing.Point(0, 0);
            this.panel_botoes.Name = "panel_botoes";
            this.panel_botoes.Size = new System.Drawing.Size(240, 561);
            this.panel_botoes.TabIndex = 0;
            // 
            // panel_topo
            // 
            this.panel_topo.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(15)))), ((int)(((byte)(20)))), ((int)(((byte)(60)))));
            this.panel_topo.Controls.Add(this.panel1);
            this.panel_topo.Controls.Add(this.btn_exitform);
            this.panel_topo.Controls.Add(this.label1);
            this.panel_topo.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel_topo.Location = new System.Drawing.Point(240, 0);
            this.panel_topo.Name = "panel_topo";
            this.panel_topo.Size = new System.Drawing.Size(1008, 95);
            this.panel_topo.TabIndex = 1;
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.lb_nome);
            this.panel1.Controls.Add(this.pictureBox1);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Right;
            this.panel1.Location = new System.Drawing.Point(919, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(89, 95);
            this.panel1.TabIndex = 2;
            // 
            // lb_nome
            // 
            this.lb_nome.AutoSize = true;
            this.lb_nome.Font = new System.Drawing.Font("Segoe UI", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lb_nome.ForeColor = System.Drawing.Color.White;
            this.lb_nome.Location = new System.Drawing.Point(25, 72);
            this.lb_nome.Name = "lb_nome";
            this.lb_nome.Size = new System.Drawing.Size(43, 17);
            this.lb_nome.TabIndex = 4;
            this.lb_nome.Text = "Cyber";
            // 
            // btn_exitform
            // 
            this.btn_exitform.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.btn_exitform.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_exitform.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_exitform.ForeColor = System.Drawing.Color.White;
            this.btn_exitform.Location = new System.Drawing.Point(25, 23);
            this.btn_exitform.Name = "btn_exitform";
            this.btn_exitform.Size = new System.Drawing.Size(45, 42);
            this.btn_exitform.TabIndex = 1;
            this.btn_exitform.Text = "X";
            this.btn_exitform.UseVisualStyleBackColor = true;
            this.btn_exitform.Visible = false;
            this.btn_exitform.Click += new System.EventHandler(this.btn_exitform_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(331, 34);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(181, 31);
            this.label1.TabIndex = 0;
            this.label1.Text = "HidroSystem";
            // 
            // panel_forms
            // 
            this.panel_forms.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel_forms.Location = new System.Drawing.Point(240, 95);
            this.panel_forms.Name = "panel_forms";
            this.panel_forms.Size = new System.Drawing.Size(1008, 466);
            this.panel_forms.TabIndex = 2;
            // 
            // pictureBox1
            // 
            this.pictureBox1.BackgroundImage = global::hidrosystem.Properties.Resources.male_user_28px;
            this.pictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.pictureBox1.Cursor = System.Windows.Forms.Cursors.Hand;
            this.pictureBox1.Location = new System.Drawing.Point(25, 15);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(50, 50);
            this.pictureBox1.TabIndex = 3;
            this.pictureBox1.TabStop = false;
            this.pictureBox1.Click += new System.EventHandler(this.pictureBox1_Click);
            // 
            // button5
            // 
            this.button5.Cursor = System.Windows.Forms.Cursors.Hand;
            this.button5.Dock = System.Windows.Forms.DockStyle.Top;
            this.button5.FlatAppearance.BorderSize = 0;
            this.button5.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.button5.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button5.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button5.ForeColor = System.Drawing.Color.White;
            this.button5.Image = global::hidrosystem.Properties.Resources.camera_25px;
            this.button5.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button5.Location = new System.Drawing.Point(0, 339);
            this.button5.Name = "button5";
            this.button5.Size = new System.Drawing.Size(240, 61);
            this.button5.TabIndex = 5;
            this.button5.Text = "   Cameras";
            this.button5.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageBeforeText;
            this.button5.UseVisualStyleBackColor = true;
            this.button5.Click += new System.EventHandler(this.button5_Click);
            // 
            // button4
            // 
            this.button4.Cursor = System.Windows.Forms.Cursors.Hand;
            this.button4.Dock = System.Windows.Forms.DockStyle.Top;
            this.button4.FlatAppearance.BorderSize = 0;
            this.button4.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.button4.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button4.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button4.ForeColor = System.Drawing.Color.White;
            this.button4.Image = global::hidrosystem.Properties.Resources.support_40px;
            this.button4.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button4.Location = new System.Drawing.Point(0, 400);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(240, 61);
            this.button4.TabIndex = 6;
            this.button4.Text = "   Suporte / CHAT";
            this.button4.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageBeforeText;
            this.button4.UseVisualStyleBackColor = true;
            this.button4.Click += new System.EventHandler(this.button4_Click);
            // 
            // button3
            // 
            this.button3.Cursor = System.Windows.Forms.Cursors.Hand;
            this.button3.Dock = System.Windows.Forms.DockStyle.Top;
            this.button3.FlatAppearance.BorderSize = 0;
            this.button3.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.button3.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button3.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button3.ForeColor = System.Drawing.Color.White;
            this.button3.Image = global::hidrosystem.Properties.Resources.push_notification;
            this.button3.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button3.Location = new System.Drawing.Point(0, 278);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(240, 61);
            this.button3.TabIndex = 4;
            this.button3.Text = "   Alertas";
            this.button3.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageBeforeText;
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // button2
            // 
            this.button2.Cursor = System.Windows.Forms.Cursors.Hand;
            this.button2.Dock = System.Windows.Forms.DockStyle.Top;
            this.button2.FlatAppearance.BorderSize = 0;
            this.button2.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.button2.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button2.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button2.ForeColor = System.Drawing.Color.White;
            this.button2.Image = global::hidrosystem.Properties.Resources.increase_24px;
            this.button2.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button2.Location = new System.Drawing.Point(0, 217);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(240, 61);
            this.button2.TabIndex = 3;
            this.button2.Text = "   Relatório";
            this.button2.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageBeforeText;
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button1
            // 
            this.button1.Cursor = System.Windows.Forms.Cursors.Hand;
            this.button1.Dock = System.Windows.Forms.DockStyle.Top;
            this.button1.FlatAppearance.BorderSize = 0;
            this.button1.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.button1.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button1.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.ForeColor = System.Drawing.Color.White;
            this.button1.Image = global::hidrosystem.Properties.Resources.wi_fi_24px;
            this.button1.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.button1.Location = new System.Drawing.Point(0, 156);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(240, 61);
            this.button1.TabIndex = 2;
            this.button1.Text = "   Monitoramento";
            this.button1.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageBeforeText;
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // btn_init
            // 
            this.btn_init.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btn_init.Dock = System.Windows.Forms.DockStyle.Top;
            this.btn_init.FlatAppearance.BorderSize = 0;
            this.btn_init.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.btn_init.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_init.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_init.ForeColor = System.Drawing.Color.White;
            this.btn_init.Image = global::hidrosystem.Properties.Resources.plant_28px;
            this.btn_init.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btn_init.Location = new System.Drawing.Point(0, 95);
            this.btn_init.Name = "btn_init";
            this.btn_init.Size = new System.Drawing.Size(240, 61);
            this.btn_init.TabIndex = 1;
            this.btn_init.Text = "   INICIO";
            this.btn_init.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageBeforeText;
            this.btn_init.UseVisualStyleBackColor = true;
            this.btn_init.Click += new System.EventHandler(this.btn_init_Click);
            // 
            // image_logo
            // 
            this.image_logo.BackgroundImage = global::hidrosystem.Properties.Resources.logo;
            this.image_logo.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.image_logo.Dock = System.Windows.Forms.DockStyle.Top;
            this.image_logo.Location = new System.Drawing.Point(0, 0);
            this.image_logo.Name = "image_logo";
            this.image_logo.Size = new System.Drawing.Size(240, 95);
            this.image_logo.TabIndex = 0;
            this.image_logo.TabStop = false;
            // 
            // home
            // 
            this.AllowDrop = true;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(1248, 561);
            this.Controls.Add(this.panel_forms);
            this.Controls.Add(this.panel_topo);
            this.Controls.Add(this.panel_botoes);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "home";
            this.Text = "HidroSystem - Sistema Para a Sua Hidroponia";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.home_Load);
            this.panel_botoes.ResumeLayout(false);
            this.panel_topo.ResumeLayout(false);
            this.panel_topo.PerformLayout();
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.image_logo)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel_botoes;
        private System.Windows.Forms.PictureBox image_logo;
        private System.Windows.Forms.Panel panel_topo;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btn_init;
        private System.Windows.Forms.Panel panel_forms;
        private System.Windows.Forms.Button btn_exitform;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label lb_nome;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.Button button5;
    }
}