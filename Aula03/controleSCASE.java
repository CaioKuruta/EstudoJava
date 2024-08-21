public class controleSCASE {
    public static void main(String[] args) {
        String medida = "P";

        switch (medida){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;

            }
            case "G":{
                System.out.println("Grande");
                break;

            }
            default:
                System.out.println("Indefinido");
        }
    }
}
