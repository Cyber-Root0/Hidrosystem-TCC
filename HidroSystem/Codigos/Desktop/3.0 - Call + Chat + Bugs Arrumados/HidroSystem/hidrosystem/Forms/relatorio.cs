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
    public partial class relatorio : Form
    {
        public relatorio()
        {
            InitializeComponent();
        }

        private void btn_pesquisar_Click(object sender, EventArgs e)
        {
            if(datetime_inicio.Text==null || datetime_fim.Text == null)
            {
                MessageBox.Show("Preencha As 2 Datas! De Inicio & Fim.");

            }
            else
            {
                //pegando as strings do formulario
                string inicio = datetime_inicio.Value.ToString("yyyy-MM-dd");
                string fim = datetime_fim.Value.ToString("yyyy-MM-dd");

                //abrindo a pagina web com requisição get pra procurar os dados se existem ou n
                string link = "http://hidrosystem1.000webhostapp.com/apis/info/relatorio.php?";
                string payload = "token="+hidrosystem.dados.token+"&inicio="+inicio+"&fim="+fim;
                System.Diagnostics.Process pStart = new System.Diagnostics.Process();
                pStart.StartInfo = new System.Diagnostics.ProcessStartInfo(@""+link+payload);
                pStart.Start();
            }
        }

        private void relatorio_Load(object sender, EventArgs e)
        {
           
        }
    }
}
