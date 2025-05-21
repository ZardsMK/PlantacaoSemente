public class Compra {
    private float vl_Receita;
    
    public void comprarSemente(float val, int qtd, Semente sem, Historico h) {
        gerarReceita(val, qtd, h);
        pegarSemente(val, qtd, sem, h);
    }
    
    public void gerarReceita(float val, int qtd, Historico h) {
        vl_Receita = val * qtd;
        h.atualizarReceita("Receita gerada: R$ " + vl_Receita);
    }
    
    public void pegarSemente(float val, int qtd, Semente sem, Historico h) {
        atualizarVenda(val, qtd, h);
        atualizarEstoque(qtd, sem);
    }
    public void atualizarVenda(float val , int qtd, Historico h) {
        h.atualizarVenda(qtd + " semente(s) comprada custando R$ " + val);
    }
    public void atualizarEstoque(int qtd, Semente sem) {
        sem.adicionarSemente(qtd);
    }
}
