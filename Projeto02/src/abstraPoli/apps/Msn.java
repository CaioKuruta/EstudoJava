package abstraPoli;

public class Msn extends MenssagemInstant{
    @Override
    public void enviaMenssagem() {
        validaConexao();
        System.out.println("Enviando mensagem do MSN");
        historicoNuvem();
    }

    @Override
    public void recebeMenssagem() {
        System.out.println("Recebendo mensagem do Msn");
    }

    @Override
    protected void historicoNuvem() {
        System.out.println("Salvo na nuvem do Msn");
    }
}
