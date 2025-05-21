import java.util.ArrayList;

public class Historico {
    ArrayList<String> bancoR = new ArrayList<String>();
    ArrayList<String> bancoV = new ArrayList<String>();
    
    public Historico() {
    }
    
    public void atualizarVenda(String msg) {
        bancoV.add(msg);
    }
    
    public void atualizarReceita(String msg) {
        bancoR.add(msg);
    }
    
    public void mostrarReceitas() {
        for(String i : bancoR) {
            System.out.println(i);
        }
    }
    
    public void mostrarVendas() {
        for(String i : bancoV) {
            System.out.println(i);
        }
    }
}
