public class controleTernario {
    public static void main(String[] args) {
        int nota = 6;
        String quero = "nao";
        String resultado = nota >= 7 ? "Aprovado" : nota>=5 && nota<=7 ? "Recuperação":"Reprovado";
        System.out.println(resultado);


        String SeQuiserSim = quero == "sim" ? "SIM" : "NAO";
        System.out.println("\nSe quiser "+SeQuiserSim);
    }
}
