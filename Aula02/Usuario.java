public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Ligada ? = "+smartTv.estado);
        System.out.println("Volume = "+smartTv.volume);
        System.out.println("Canal atual = "+smartTv.canal);

        smartTv.aumentaVolume();

        smartTv.aumentaVolume();


        System.out.println("Ligada ? = "+smartTv.estado);
        System.out.println("Volume = "+smartTv.volume);
        System.out.println("Canal atual = "+smartTv.canal);

        smartTv.verCanal();

        smartTv.escolherCanal(45);

        smartTv.verCanal();
    }
}
