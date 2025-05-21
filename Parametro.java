public class Parametro {
    private int pr_Semente = 30000;
    
    public int getParametro() {
        return pr_Semente;
    }
    
    public void atualizarParametro(int novoParametro) {
        this.pr_Semente = novoParametro;
    }
}
