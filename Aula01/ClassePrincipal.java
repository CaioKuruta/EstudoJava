public class ClassePrincipal {

        public static void main(String[] args) {
            String primeiroNome = "Caio";
            String segundoNome = "Augusto";
            System.out.printf(nomeCompleto(primeiroNome,segundoNome));
        }

        public static String nomeCompleto(String primeiroNome,String segundoNome){
            return "Primeiro teste java : " + primeiroNome.concat(" ").concat(segundoNome);
        };
    }

