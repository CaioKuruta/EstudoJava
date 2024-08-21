import java.util.Scanner;
public class controleSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 25.5;
        double saque;
        double a;
        System.out.println("Quanto deseja sacar ?");
        saque = (sc.nextDouble());

        if (saque <= saldo){
            System.out.println("Saque realizado no valor de "+saque);
            a = saldo - saque;
            System.out.println("\n Valor do saldo atual é "+a);
        }
        else {
            System.out.println("Valor insuficiente\n");
            System.out.println("Valo atual em conta "+saldo);
        }


    }
}
