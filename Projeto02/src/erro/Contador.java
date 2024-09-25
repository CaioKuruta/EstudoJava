import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidos e) {
            throw new RuntimeException(e);

        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidos {
        if (parametroUm>parametroDois){
            throw new ParametrosInvalidos();
        }

        int contagem = parametroDois - parametroUm;
        int x = 0;
        while(x < contagem){
            System.out.println("Volta "+x);
            x++;
        }
    }
}