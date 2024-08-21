package ContaBanco;
import java.util.Random;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        Double realRandom = random.nextDouble()*178;
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta ! :");
        numero = Integer.parseInt(sc.nextLine());
        System.out.println("Por favor, digite o número da Agência ! :");
        agencia = sc.next();
        System.out.println("Por favor, digite o seu nome ! :");
        nomeCliente = sc.next();

        System.out.println("Olá "+nomeCliente+" da agencia "+agencia+"/Conta "+numero+"\n Seu saldo total é de : "+realRandom);
    }
}
