import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Semente s = new Semente();
		Compra c = new Compra();
		Historico h = new Historico();

        int opcao;
        
        do {
            System.out.println("1 - Pilulas para sementes");
            System.out.println("2 - Plantar Semente");
            System.out.println("3 - Comprar Semente");
            System.out.println("4 - Gerar Relatorio");
            System.out.println("5 - Mudar Parametro");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt(); 
            scanner.nextLine();
            
            if (opcao == 1) {
                System.out.print("Numero de pilulas: ");
                int scan = scanner.nextInt();
                scanner.nextLine();
                s.adicionarPilula(scan);
            } else if (opcao == 2) {
                System.out.print("Numero de sementes para plantar: ");
                int scan = scanner.nextInt();
                scanner.nextLine();
                s.plantarSemente(scan);
            } else if (opcao == 3) {
                System.out.print("Valor da sementes: ");
                float scan = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Quantas sementes deseja comprar: ");
                int scan2 = scanner.nextInt();
                scanner.nextLine();
                c.comprarSemente(scan, scan2, s, h);
                s.getStatus();
            } else if (opcao == 4) {
                System.out.println("Situação:");
                s.getStatus();
                System.out.println("Receitas:");
                h.mostrarReceitas();
                System.out.println("Vendas:");
                h.mostrarVendas();
            } else if (opcao == 5) {
                System.out.print("Novo parametro de pilulas: ");
                int scan = scanner.nextInt();
                s.atualizarParametro(scan);
            } else if (opcao == 0) {
                System.out.println("Tchau");
            } else {
                System.out.println("Opcap Invalida");
            }
        } while (opcao != 0);

        scanner.close();
	}
}
