public class ClassePrincipal {

        public static void main(String[] args) {

            int numero = 07;
            String primeiroNome = "Caio";
            String segundoNome = "Oliveira";
            System.out.printf(nomeCompleto(primeiroNome,segundoNome));
            System.out.println(numero);

            int n1 = 8;
            int n2 = 15;
            String resultado;

            if (n1 > n2)
                {resultado = "true";}
            else
                {resultado = "false";}

            System.out.println("Resultado com if e else = "+resultado);

            resultado = n1 == n2 ? "verdadeiro" : "falso";

            System.out.println("Resultado com operador ternario = "+resultado);
        }


        public static String nomeCompleto(String primeiroNome,String segundoNome){
            return "Primeiro teste java : " + primeiroNome.concat(" ").concat(segundoNome);
            }
    }
