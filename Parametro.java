public class Parametro {
    protected int parametro = 30000;

    public Parametro(int parametro){
        this.parametro = parametro;
    }
    public void atualizarParametro(int novoParametro) {
        parametro = novoParametro;
    }
}
