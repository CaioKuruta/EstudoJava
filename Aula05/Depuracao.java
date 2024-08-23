public class Depuracao {
    public static void main(String[] args) {
        System.out.println("Inicia metodo main");
        a();
        System.out.println("Finaliza metodo main");

    }

    static void a(){
        System.out.println("Inicia metodo a");
        b();//chama metodo b
        System.out.println("Finaliza metodo a");
    }
    static void b(){
        System.out.println("Inicia metodo b");
        for(int x = 0;x < 4;x++){
            System.out.println("dentro do metodo b "+x+" vezes");
        }
        claudio();//chama metodo c
        System.out.println("Finaliza metodo b");
    }
    static void claudio(){
        System.out.println("Inicia metodo c");
        Thread.dumpStack();
        System.out.println("Finaliza metodo c");
    }
}
