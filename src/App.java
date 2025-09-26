import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int opcao = -1;

        while(opcao != 0){
            System.out.println("Menu de Opções:");
            System.out.println("1. Calcular frete e prazo de entrega para Caminhão");
            System.out.println("2. Calcular frete para Avião de Carga");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = Integer.parseInt(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            switch(opcao){
                case 1:
                    System.out.print("Qual a capacidade do caminhão em kg? ");
                    
                case 2:
                    // Dados do avião de carga
                    AviaoCarga aviao = new AviaoCarga(100000, 600, 12000, 1.5, 10);
                    double distanciaAviao = 2000; // km
                    double pesoAviao = 80000; // kg

                    double freteAviao = aviao.calcularFrete(distanciaAviao, pesoAviao);

                    System.out.printf("Frete para Avião de Carga: R$ %.2f\n", freteAviao);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
