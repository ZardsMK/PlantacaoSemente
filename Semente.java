public class Semente extends Parametro {
        private int sobra_Convertida = 0;
        private int qt_Convertida = 0;
        private int es_Semente = 0;
    
    public void getStatus() {
        System.out.println("Deve plantar :" + qt_Convertida +"\nEstoque de sementes: "+ es_Semente +"\nSobra de pilulas: "+ sobra_Convertida);
    }
    
    public void plantarSemente(int val) {
        if(es_Semente >= val) {
            es_Semente -= val;
            qt_Convertida -= val;
            System.out.println(val + "semente(s) plantada.");
        } else if (es_Semente > 0){
            
            qt_Convertida -= es_Semente;
            System.out.println("Plantadas apenas " + es_Semente + " semente(s).");
            es_Semente = 0;
        } else {
            System.out.println("Sem sementes disponíveis para plantar.");
        }

         System.out.println("Estoque atual de sementes: " + es_Semente);
         System.out.println("Sementes ainda a plantar (débito): " + qt_Convertida);
    }
    
    public void adicionarPilula(int val) {
        
        int total = sobra_Convertida + val;
        int parametro = getParametro();
        
        int sementesConvertidas = total / parametro;
        sobra_Convertida = total % parametro;
        
        if(sementesConvertidas >= 1) {
            qt_Convertida += sementesConvertidas;
            System.out.println(sementesConvertidas + " semente(s) adicionada.");
        } else {
            System.out.println("Nenhuma permissao de semente adicionada.");
        }
        
        plantarSemente(sementesConvertidas);
    }
    
    public void adicionarSemente(int val) {
        es_Semente += val;
    } 
}
