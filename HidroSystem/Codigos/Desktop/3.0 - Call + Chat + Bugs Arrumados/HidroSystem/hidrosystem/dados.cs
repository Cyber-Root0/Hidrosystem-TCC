using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace hidrosystem
{
    class dados
    {
        //variavel id
        private static string _id;
        public static string id
        {
            get { return _id; }
            set { _id = value; }
        }

        //variavel user
        private static string _user;
        public static string user
        {
            get { return _user; }
            set { _user = value; }
        }

        //variavel token
        private static string _token;
        public static string token
        {
            get { return _token; }
            set { _token = value; }
        }

        //variavel nome
        private static string _nome;
        public static string nome
        {
            get { return _nome; }
            set { _nome = value; }
        }

        //variavel de configuraçãpo do  panel
        private static bool _panel;
        public static bool panel
        {
            get { return _panel; }
            set { _panel = value; }
        }




    }
}
