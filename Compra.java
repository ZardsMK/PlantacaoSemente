public class Compra {
    private int vl_Orcamento;
    private int vl_Receita;
    private int vl_Estoque;
    private int vl_Venda;
    private int qt_Semente;
    
    public Compra() {
        
    }
    
    public void comprarSemente(int val, int qtd, Semente sem) {
        gerarReceita(val, qtd);
        gerarOrcamento(val, qtd);
        pegarSemente(qtd, sem);
    }
    
    public void gerarOrcamento(int val, int qtd) {
        vl_Orcamento = val * qtd;
        System.out.println("Orçamento gerado: R$ " + vl_Orcamento);
    }
    
    public void gerarReceita(int val, int qtd) {
        vl_Receita = val * qtd;
        System.out.println("Receita gerada: R$ " + vl_Receita);
    }
    
    public void pegarSemente(int qtd, Semente sem) {
        atualizarVenda();
        atualizarEstoque(qtd, sem);
    }
    public void atualizarVenda() {
        
    }
    public void atualizarEstoque(int qtd, Semente sem) {
        // adicionarSemente(int qtd) es_Semente += qtd
        sem.adicionarSemente(qtd);
    }
}
