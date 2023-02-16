namespace hidrosystem.Forms
{
    partial class alertas
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
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle5 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle6 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle7 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle8 = new System.Windows.Forms.DataGridViewCellStyle();
            this.panel1 = new System.Windows.Forms.Panel();
            this.panel4 = new System.Windows.Forms.Panel();
            this.label3 = new System.Windows.Forms.Label();
            this.panel3 = new System.Windows.Forms.Panel();
            this.panel2 = new System.Windows.Forms.Panel();
            this.panel5 = new System.Windows.Forms.Panel();
            this.lb_qtdcli = new System.Windows.Forms.Label();
            this.lb_qtdclients = new System.Windows.Forms.Label();
            this.grid_alertas = new System.Windows.Forms.DataGridView();
            this.ID = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ARDUINO = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.MENSAGEM = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.HORA = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.DATA = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.panel1.SuspendLayout();
            this.panel4.SuspendLayout();
            this.panel5.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.grid_alertas)).BeginInit();
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
            this.panel1.Size = new System.Drawing.Size(1123, 80);
            this.panel1.TabIndex = 8;
            // 
            // panel4
            // 
            this.panel4.Controls.Add(this.label3);
            this.panel4.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel4.Location = new System.Drawing.Point(328, 0);
            this.panel4.Margin = new System.Windows.Forms.Padding(4);
            this.panel4.Name = "panel4";
            this.panel4.Size = new System.Drawing.Size(487, 80);
            this.panel4.TabIndex = 2;
            // 
            // label3
            // 
            this.label3.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Left | System.Windows.Forms.AnchorStyles.Right)));
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Segoe UI", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.Color.White;
            this.label3.Location = new System.Drawing.Point(72, 24);
            this.label3.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(209, 30);
            this.label3.TabIndex = 2;
            this.label3.Text = "ALERTAS RECENTES";
            // 
            // panel3
            // 
            this.panel3.Dock = System.Windows.Forms.DockStyle.Right;
            this.panel3.Location = new System.Drawing.Point(815, 0);
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
            this.panel2.Size = new System.Drawing.Size(328, 80);
            this.panel2.TabIndex = 0;
            // 
            // panel5
            // 
            this.panel5.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(51)))), ((int)(((byte)(51)))), ((int)(((byte)(76)))));
            this.panel5.Controls.Add(this.lb_qtdcli);
            this.panel5.Controls.Add(this.lb_qtdclients);
            this.panel5.Cursor = System.Windows.Forms.Cursors.Default;
            this.panel5.Location = new System.Drawing.Point(100, 457);
            this.panel5.Margin = new System.Windows.Forms.Padding(4);
            this.panel5.Name = "panel5";
            this.panel5.Size = new System.Drawing.Size(876, 24);
            this.panel5.TabIndex = 4;
            // 
            // lb_qtdcli
            // 
            this.lb_qtdcli.AutoSize = true;
            this.lb_qtdcli.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lb_qtdcli.ForeColor = System.Drawing.Color.White;
            this.lb_qtdcli.Location = new System.Drawing.Point(440, 0);
            this.lb_qtdcli.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lb_qtdcli.Name = "lb_qtdcli";
            this.lb_qtdcli.Size = new System.Drawing.Size(0, 21);
            this.lb_qtdcli.TabIndex = 1;
            // 
            // lb_qtdclients
            // 
            this.lb_qtdclients.AutoSize = true;
            this.lb_qtdclients.Font = new System.Drawing.Font("Segoe UI", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lb_qtdclients.ForeColor = System.Drawing.Color.White;
            this.lb_qtdclients.Location = new System.Drawing.Point(432, 0);
            this.lb_qtdclients.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lb_qtdclients.Name = "lb_qtdclients";
            this.lb_qtdclients.Size = new System.Drawing.Size(0, 21);
            this.lb_qtdclients.TabIndex = 0;
            // 
            // grid_alertas
            // 
            this.grid_alertas.AllowUserToAddRows = false;
            this.grid_alertas.AllowUserToDeleteRows = false;
            this.grid_alertas.AllowUserToOrderColumns = true;
            dataGridViewCellStyle5.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.grid_alertas.AlternatingRowsDefaultCellStyle = dataGridViewCellStyle5;
            this.grid_alertas.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.AllCells;
            this.grid_alertas.AutoSizeRowsMode = System.Windows.Forms.DataGridViewAutoSizeRowsMode.AllCells;
            this.grid_alertas.BackgroundColor = System.Drawing.Color.AliceBlue;
            this.grid_alertas.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.grid_alertas.CellBorderStyle = System.Windows.Forms.DataGridViewCellBorderStyle.Sunken;
            dataGridViewCellStyle6.Alignment = System.Windows.Forms.DataGridViewContentAlignment.BottomCenter;
            dataGridViewCellStyle6.BackColor = System.Drawing.SystemColors.Control;
            dataGridViewCellStyle6.Font = new System.Drawing.Font("Segoe UI", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle6.ForeColor = System.Drawing.SystemColors.WindowText;
            dataGridViewCellStyle6.Padding = new System.Windows.Forms.Padding(0, 4, 0, 0);
            dataGridViewCellStyle6.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle6.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle6.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.grid_alertas.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle6;
            this.grid_alertas.ColumnHeadersHeight = 35;
            this.grid_alertas.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.ID,
            this.ARDUINO,
            this.MENSAGEM,
            this.HORA,
            this.DATA});
            this.grid_alertas.Cursor = System.Windows.Forms.Cursors.Default;
            dataGridViewCellStyle7.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleRight;
            dataGridViewCellStyle7.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle7.Font = new System.Drawing.Font("Segoe UI", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle7.ForeColor = System.Drawing.Color.Black;
            dataGridViewCellStyle7.Padding = new System.Windows.Forms.Padding(0, 5, 0, 0);
            dataGridViewCellStyle7.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle7.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle7.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.grid_alertas.DefaultCellStyle = dataGridViewCellStyle7;
            this.grid_alertas.Location = new System.Drawing.Point(100, 105);
            this.grid_alertas.Margin = new System.Windows.Forms.Padding(4);
            this.grid_alertas.MinimumSize = new System.Drawing.Size(876, 348);
            this.grid_alertas.Name = "grid_alertas";
            this.grid_alertas.ReadOnly = true;
            dataGridViewCellStyle8.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle8.BackColor = System.Drawing.SystemColors.Control;
            dataGridViewCellStyle8.Font = new System.Drawing.Font("Segoe UI", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle8.ForeColor = System.Drawing.SystemColors.WindowText;
            dataGridViewCellStyle8.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle8.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle8.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.grid_alertas.RowHeadersDefaultCellStyle = dataGridViewCellStyle8;
            this.grid_alertas.RowHeadersWidth = 30;
            this.grid_alertas.RowTemplate.DefaultCellStyle.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            this.grid_alertas.RowTemplate.Height = 30;
            this.grid_alertas.Size = new System.Drawing.Size(876, 348);
            this.grid_alertas.TabIndex = 3;
            // 
            // ID
            // 
            this.ID.HeaderText = "ID";
            this.ID.Name = "ID";
            this.ID.ReadOnly = true;
            this.ID.Width = 49;
            // 
            // ARDUINO
            // 
            this.ARDUINO.HeaderText = "ARDUINO";
            this.ARDUINO.Name = "ARDUINO";
            this.ARDUINO.ReadOnly = true;
            // 
            // MENSAGEM
            // 
            this.MENSAGEM.HeaderText = "ALERTAS";
            this.MENSAGEM.Name = "MENSAGEM";
            this.MENSAGEM.ReadOnly = true;
            this.MENSAGEM.Width = 92;
            // 
            // HORA
            // 
            this.HORA.HeaderText = "HORA";
            this.HORA.Name = "HORA";
            this.HORA.ReadOnly = true;
            this.HORA.Width = 75;
            // 
            // DATA
            // 
            this.DATA.HeaderText = "DATA";
            this.DATA.Name = "DATA";
            this.DATA.ReadOnly = true;
            this.DATA.Width = 71;
            // 
            // alertas
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1123, 547);
            this.Controls.Add(this.panel5);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.grid_alertas);
            this.Font = new System.Drawing.Font("Segoe UI", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "alertas";
            this.StartPosition = System.Windows.Forms.FormStartPosition.Manual;
            this.Text = "alertas";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.alertas_Load);
            this.panel1.ResumeLayout(false);
            this.panel4.ResumeLayout(false);
            this.panel4.PerformLayout();
            this.panel5.ResumeLayout(false);
            this.panel5.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.grid_alertas)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Panel panel5;
        private System.Windows.Forms.Label lb_qtdcli;
        private System.Windows.Forms.Label lb_qtdclients;
        public System.Windows.Forms.DataGridView grid_alertas;
        private System.Windows.Forms.DataGridViewTextBoxColumn ID;
        private System.Windows.Forms.DataGridViewTextBoxColumn ARDUINO;
        private System.Windows.Forms.DataGridViewTextBoxColumn MENSAGEM;
        private System.Windows.Forms.DataGridViewTextBoxColumn HORA;
        private System.Windows.Forms.DataGridViewTextBoxColumn DATA;
    }
}