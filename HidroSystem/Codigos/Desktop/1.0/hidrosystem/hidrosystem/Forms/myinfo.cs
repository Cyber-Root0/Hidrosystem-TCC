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
    public partial class myinfo : Form
    {
        public myinfo()
        {
            InitializeComponent();
        }

        private void myinfo_Load(object sender, EventArgs e)
        {
            // preenchendo os valores da classe no formulario
            tb_id.Text = hidrosystem.dados.id;
            tb_nome.Text = hidrosystem.dados.nome;
            tb_token.Text = hidrosystem.dados.token;
            tb_user.Text = hidrosystem.dados.user;
        }
    }
}
