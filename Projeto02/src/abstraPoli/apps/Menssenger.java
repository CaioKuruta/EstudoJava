package abstraPoli;

public class Menssenger extends MenssagemInstant{
    @Override
    public void enviaMenssagem() {
        validaConexao();
        System.out.println("Enviando mensagem do Menssenger");
        historicoNuvem();
    }

    @Override
    public void recebeMenssagem() {

        System.out.println("Recebendo mensagem do Menssenger");
    }
    protected void historicoNuvem() {
        System.out.println("Salvo na nuvem do Messenger");
    }
}

