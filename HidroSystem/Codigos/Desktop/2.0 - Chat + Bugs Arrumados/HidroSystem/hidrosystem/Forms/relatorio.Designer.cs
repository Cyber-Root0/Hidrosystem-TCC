namespace hidrosystem.Forms
{
    partial class relatorio
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
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.btn_pesquisar = new System.Windows.Forms.Button();
            this.datetime_inicio = new System.Windows.Forms.DateTimePicker();
            this.datetime_fim = new System.Windows.Forms.DateTimePicker();
            this.panel1 = new System.Windows.Forms.Panel();
            this.panel4 = new System.Windows.Forms.Panel();
            this.label3 = new System.Windows.Forms.Label();
            this.panel3 = new System.Windows.Forms.Panel();
            this.panel2 = new System.Windows.Forms.Panel();
            this.panel1.SuspendLayout();
            this.panel4.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(313, 135);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(52, 20);
            this.label1.TabIndex = 1;
            this.label1.Text = "Inicio";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(552, 135);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(40, 20);
            this.label2.TabIndex = 3;
            this.label2.Text = "FIM";
            // 
            // btn_pesquisar
            // 
            this.btn_pesquisar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.btn_pesquisar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btn_pesquisar.FlatAppearance.BorderSize = 0;
            this.btn_pesquisar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btn_pesquisar.Font = new System.Drawing.Font("Microsoft Sans Serif", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_pesquisar.ForeColor = System.Drawing.Color.White;
            this.btn_pesquisar.Location = new System.Drawing.Point(416, 240);
            this.btn_pesquisar.Name = "btn_pesquisar";
            this.btn_pesquisar.Size = new System.Drawing.Size(136, 55);
            this.btn_pesquisar.TabIndex = 4;
            this.btn_pesquisar.Text = "Pesquisar";
            this.btn_pesquisar.UseVisualStyleBackColor = false;
            this.btn_pesquisar.Click += new System.EventHandler(this.btn_pesquisar_Click);
            // 
            // datetime_inicio
            // 
            this.datetime_inicio.CalendarFont = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.datetime_inicio.Cursor = System.Windows.Forms.Cursors.Hand;
            this.datetime_inicio.CustomFormat = "";
            this.datetime_inicio.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.datetime_inicio.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.datetime_inicio.ImeMode = System.Windows.Forms.ImeMode.NoControl;
            this.datetime_inicio.Location = new System.Drawing.Point(241, 167);
            this.datetime_inicio.Name = "datetime_inicio";
            this.datetime_inicio.Size = new System.Drawing.Size(210, 35);
            this.datetime_inicio.TabIndex = 5;
            // 
            // datetime_fim
            // 
            this.datetime_fim.CalendarFont = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.datetime_fim.Cursor = System.Windows.Forms.Cursors.Hand;
            this.datetime_fim.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.datetime_fim.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.datetime_fim.Location = new System.Drawing.Point(516, 167);
            this.datetime_fim.Name = "datetime_fim";
            this.datetime_fim.Size = new System.Drawing.Size(210, 35);
            this.datetime_fim.TabIndex = 6;
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(94)))), ((int)(((byte)(95)))), ((int)(((byte)(197)))));
            this.panel1.Controls.Add(this.panel4);
            this.panel1.Controls.Add(this.panel3);
            this.panel1.Controls.Add(this.panel2);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(894, 69);
            this.panel1.TabIndex = 7;
            // 
            // panel4
            // 
            this.panel4.Controls.Add(this.label3);
            this.panel4.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel4.Location = new System.Drawing.Point(291, 0);
            this.panel4.Name = "panel4";
            this.panel4.Size = new System.Drawing.Size(321, 69);
            this.panel4.TabIndex = 2;
            // 
            // label3
            // 
            this.label3.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Left | System.Windows.Forms.AnchorStyles.Right)));
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.Color.White;
            this.label3.Location = new System.Drawing.Point(52, 18);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(249, 37);
            this.label3.TabIndex = 2;
            this.label3.Text = "Preencha as Datas";
            // 
            // panel3
            // 
            this.panel3.Dock = System.Windows.Forms.DockStyle.Right;
            this.panel3.Location = new System.Drawing.Point(612, 0);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(282, 69);
            this.panel3.TabIndex = 1;
            // 
            // panel2
            // 
            this.panel2.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel2.Location = new System.Drawing.Point(0, 0);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(291, 69);
            this.panel2.TabIndex = 0;
            // 
            // relatorio
            // 
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.None;
            this.ClientSize = new System.Drawing.Size(894, 492);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.datetime_fim);
            this.Controls.Add(this.datetime_inicio);
            this.Controls.Add(this.btn_pesquisar);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "relatorio";
            this.Text = "relatorio";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.relatorio_Load);
            this.panel1.ResumeLayout(false);
            this.panel4.ResumeLayout(false);
            this.panel4.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btn_pesquisar;
        private System.Windows.Forms.DateTimePicker datetime_fim;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Panel panel4;
        private System.Windows.Forms.DateTimePicker datetime_inicio;
    }
}