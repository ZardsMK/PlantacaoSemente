public class Semente Extends Parametro{
        private int qt_Pilula;
        private int es_Semente = 0;
        private int qt_Semente;
        private int qt_Convertida = 0;
        private int sobra_Convertida = 0;
        private int vl_Compra;
        private int parametro;
    
    public Semente(int parametro) {
            super(parametro);
        
    }
    
    // public void VerificarPilula() {
        
    // }
    
    // public void VerificarEstoque() {
        
    // }
    
    public void plantarSemente(int val) {
        if(qt_Convertida >= val) {
            if(es_Semente >= val) {
                System.out.println(val + "semente(s) plantada.");
                qt_Convertida -= val;
                es_Semente -= val;
                System.out.println(qt_Convertida + "permissoes de semente restante.");
                System.out.println(es_Semente + "semente(s) do estoque restante.");
            } else {
                System.out.println("Sementes do estoque insuficiente.");
                System.out.println(es_Semente + "semente(s) do estoque restante.");
            }
        }
        else {
            System.out.println("Permissao para plantar insuficiente.");
            System.out.println(qt_Convertida + "permissoes de semente restante.");
        }
    }
    
    public void adicionarPilula(int val) {
        
        int calc = sobra_Convertida + val;
        int sementesConvertidas = calc / parametro;
        sobra_Convertida = calc % parametro;
        
        if(sementesConvertidas >= 1) {
            qt_Convertida += sementesConvertidas;
            System.out.println(sementesConvertidas + " semente(s) adicionada.");
        } else {
            System.out.println("Nenhuma permissao de semente adicionada.");
        }
        
        System.out.println("Sobra atual de permissao: " + sobra_Convertida);
    }
}
