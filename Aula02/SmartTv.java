public class SmartTv {
    boolean estado = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        estado = true;
    }
    public void desligar(){
        estado = false;
    }
    public void mudarCanal(){
        ++canal;
    }
    public void voltarCanal(){
        --canal;
    }
    public void aumentaVolume(){
        ++volume;
    }
    public void diminuiVolume(){
        --volume;
    }
    public void verCanal(){
        System.out.println(canal);
    }
    public void escolherCanal(int novoCanal){
        canal = novoCanal;
    }
}
