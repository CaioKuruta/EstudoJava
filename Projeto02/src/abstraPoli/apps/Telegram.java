package abstraPoli;

public class Telegram extends MenssagemInstant{
    @Override
    public void enviaMenssagem() {
        validaConexao();
        System.out.println("Enviando mensagem do Telegram");
        historicoNuvem();
    }

    @Override
    public void recebeMenssagem() {
        System.out.println("Recebendo mensagem do Telegram");
    }
    protected void historicoNuvem() {
        System.out.println("Salvo na nuvem do Telegram");
    }
}

