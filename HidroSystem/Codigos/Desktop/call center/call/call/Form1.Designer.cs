namespace call
{
    partial class Form1
    {
        /// <summary>
        /// Variável de designer necessária.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpar os recursos que estão sendo usados.
        /// </summary>
        /// <param name="disposing">true se for necessário descartar os recursos gerenciados; caso contrário, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código gerado pelo Windows Form Designer

        /// <summary>
        /// Método necessário para suporte ao Designer - não modifique 
        /// o conteúdo deste método com o editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.cb_admins = new System.Windows.Forms.ComboBox();
            this.lb_user = new System.Windows.Forms.Label();
            this.img_admin = new System.Windows.Forms.PictureBox();
            this.button2 = new System.Windows.Forms.Button();
            this.btn_sair = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.img_admin)).BeginInit();
            this.SuspendLayout();
            // 
            // cb_admins
            // 
            this.cb_admins.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cb_admins.Font = new System.Drawing.Font("Segoe UI", 14.25F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cb_admins.Items.AddRange(new object[] {
            "Bruno",
            "Cristian",
            "Thiago"});
            this.cb_admins.Location = new System.Drawing.Point(25, 307);
            this.cb_admins.Name = "cb_admins";
            this.cb_admins.Size = new System.Drawing.Size(213, 33);
            this.cb_admins.TabIndex = 5;
            this.cb_admins.SelectedIndexChanged += new System.EventHandler(this.cb_admins_SelectedIndexChanged);
            // 
            // lb_user
            // 
            this.lb_user.AutoSize = true;
            this.lb_user.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lb_user.ForeColor = System.Drawing.Color.White;
            this.lb_user.Location = new System.Drawing.Point(106, 233);
            this.lb_user.Name = "lb_user";
            this.lb_user.Size = new System.Drawing.Size(54, 18);
            this.lb_user.TabIndex = 8;
            this.lb_user.Text = "USER";
            // 
            // img_admin
            // 
            this.img_admin.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.img_admin.Location = new System.Drawing.Point(43, 36);
            this.img_admin.Name = "img_admin";
            this.img_admin.Size = new System.Drawing.Size(176, 183);
            this.img_admin.TabIndex = 7;
            this.img_admin.TabStop = false;
            // 
            // button2
            // 
            this.button2.BackColor = System.Drawing.Color.Lime;
            this.button2.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.button2.Cursor = System.Windows.Forms.Cursors.Hand;
            this.button2.FlatAppearance.BorderSize = 0;
            this.button2.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button2.ForeColor = System.Drawing.SystemColors.ControlText;
            this.button2.Image = global::call.Properties.Resources.phone_26px;
            this.button2.Location = new System.Drawing.Point(39, 368);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(53, 54);
            this.button2.TabIndex = 4;
            this.button2.UseVisualStyleBackColor = false;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // btn_sair
            // 
            this.btn_sair.BackColor = System.Drawing.Color.Red;
            this.btn_sair.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btn_sair.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btn_sair.FlatAppearance.BorderSize = 0;
            this.btn_sair.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_sair.Image = global::call.Properties.Resources.phone_26px;
            this.btn_sair.Location = new System.Drawing.Point(166, 368);
            this.btn_sair.Name = "btn_sair";
            this.btn_sair.Size = new System.Drawing.Size(53, 54);
            this.btn_sair.TabIndex = 3;
            this.btn_sair.UseVisualStyleBackColor = false;
            this.btn_sair.Click += new System.EventHandler(this.btn_sair_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(15)))), ((int)(((byte)(20)))), ((int)(((byte)(60)))));
            this.ClientSize = new System.Drawing.Size(279, 450);
            this.Controls.Add(this.lb_user);
            this.Controls.Add(this.img_admin);
            this.Controls.Add(this.cb_admins);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.btn_sair);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximumSize = new System.Drawing.Size(295, 489);
            this.Name = "Form1";
            this.Text = "Call Center | HidroSystem";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.Form1_FormClosing);
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.img_admin)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Button btn_sair;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.ComboBox cb_admins;
        private System.Windows.Forms.Label lb_user;
        private System.Windows.Forms.PictureBox img_admin;
    }
}

