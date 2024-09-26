package abstraPoli;

public abstract class MenssagemInstant {

    public abstract void enviaMenssagem();
    public abstract void recebeMenssagem();
    protected abstract void historicoNuvem();

    public void validaConexao(){
        System.out.println("Conexao validada");
    }
}
