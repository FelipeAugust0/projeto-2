import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Transporte> transportes = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu de Transporte");
            System.out.println("1 - Adicionar Caminhão");
            System.out.println("2 - Adicionar Avião de Carga");
            System.out.println("3 - Listar Transportes e Calcular Frete/Prazo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opc = sc.nextInt();
                sc.nextLine();

                if (opc == 0)
                    break;

                switch (opc) {
                    case 1:
                        System.out.print("\nCapacidade (Kg): ");
                        double capC = sc.nextDouble();
                        System.out.print("Velocidade Média (km/h): ");
                        double velC = sc.nextDouble();
                        System.out.print("Número de Eixos: ");
                        int eixos = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Tipo de Combustível: ");
                        String combustivel = sc.nextLine();
                        System.out.print("Tipo de Carga (seca/refrigerada): ");
                        String tipoCarga = sc.nextLine();
                        System.out.print("Distância (km): ");
                        double distC = sc.nextDouble();
                        System.out.print("Peso da Carga (Kg): ");
                        double pesoC = sc.nextDouble();

                        Caminhao caminhao = new Caminhao(capC, velC, distC, pesoC, eixos, combustivel, tipoCarga);
                        transportes.add(caminhao);
                        System.out.println("\nFrete: R$ " + caminhao.calcularFrete(distC, pesoC));
                        System.out.println("Prazo: " + caminhao.calcularPrazoEntrega(distC) + " horas");
                        break;

                    case 2:
                        System.out.print("\nCapacidade (Kg): ");
                        double capA = sc.nextDouble();
                        System.out.print("Velocidade Média (km/h): ");
                        double velA = sc.nextDouble();
                        System.out.print("Altitude Máxima (m): ");
                        double alt = sc.nextDouble();
                        System.out.print("Autonomia (horas): ");
                        double auto = sc.nextDouble();
                        System.out.print("Distância (km): ");
                        double distA = sc.nextDouble();
                        System.out.print("Peso da Carga (Kg): ");
                        double pesoA = sc.nextDouble();

                        AviaoCarga aviao = new AviaoCarga(capA, velA, distA, pesoA, alt, pesoA, auto);
                        transportes.add(aviao);
                        System.out.println("Frete: R$ " + aviao.calcularFrete(distA, pesoA));
                        System.out.println("Prazo: " + aviao.calcularPrazoEntrega(distA) + " horas");
                        break;

                    case 3:
                        for (Transporte t : transportes) {
                            System.out.println("\nTransporte: " + t.getClass().getSimpleName());
                            System.out
                                    .println("Prazo de Entrega para 100 km: " + t.calcularPrazoEntrega(100) + " horas");
                        }
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida. Por favor, digite números onde necessário.");
                sc.nextLine(); // limpar buffer do Scanner
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                sc.nextLine(); // limpar buffer
            }
        }

        sc.close();
        System.out.println("Programa encerrado.");
    }
}
