import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Transporte> transportes = new ArrayList<>();
        ArrayList<Double> fretes = new ArrayList<>();
        ArrayList<Double> prazos = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu de Transporte");
            System.out.println("1 - Adicionar Caminhão");
            System.out.println("2 - Adicionar Avião de Carga");
            System.out.println("3 - Listar Fretes já calculados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = sc.nextInt();
                sc.nextLine();

                if (opcao == 0)
                    break;

                switch (opcao) {
                    case 1:
                        double capC = lerDouble(sc, "\nCapacidade (Kg): ");
                        double velC = lerDouble(sc, "Velocidade Média (km/h): ");
                        int eixos = lerInt(sc, "Número de Eixos: ");

                        String combustivel;
                        while (true) {
                            System.out.print("Tipo de Combustível (diesel/gasolina/etanol): ");
                            combustivel = sc.nextLine().trim().toLowerCase();
                            if (combustivel.equals("diesel") || combustivel.equals("gasolina")
                                    || combustivel.equals("etanol")) {
                                break;
                            } else {
                                System.out.println("Erro: digite apenas diesel, gasolina ou etanol.\n");
                            }
                        }

                        String tipoCarga;
                        while (true) {
                            System.out.print("Tipo de Carga (seca/refrigerada): ");
                            tipoCarga = sc.nextLine().trim().toLowerCase();
                            if (tipoCarga.equals("seca") || tipoCarga.equals("refrigerada")) {
                                break;
                            } else {
                                System.out.println("Erro: digite apenas 'seca' ou 'refrigerada'.");
                            }
                        }

                        double distC = lerDouble(sc, "Distância (km): ");
                        double pesoC = lerDouble(sc, "Peso da Carga (Kg): ");

                        while (pesoC > capC) {
                            System.out.println(
                                    "Erro: o peso da carga não pode ser maior que a capacidade (" + capC + " Kg).");
                            pesoC = lerDouble(sc, "Digite novamente o Peso da Carga (Kg): ");
                        }

                        Caminhao caminhao = new Caminhao(capC, velC, distC, pesoC, eixos, combustivel, tipoCarga);
                        transportes.add(caminhao);
                        double freteC = caminhao.calcularFrete(distC, pesoC);
                        fretes.add(freteC);
                        double prazoC = caminhao.calcularPrazoEntrega(distC, velC);
                        prazos.add(prazoC);
                        System.out.printf("Frete: R$ %.2f", freteC);
                        System.out.printf("\nPrazo: %.2f horas\n", prazoC);
                        break;

                    case 2:
                        double capA = lerDouble(sc, "\nCapacidade (Kg): ");
                        double velA = lerDouble(sc, "Velocidade Média (km/h): ");
                        double alt = lerDouble(sc, "Altitude Máxima (m): ");
                        double auto = lerDouble(sc, "Autonomia (horas): ");
                        double distA = lerDouble(sc, "Distância (km): ");
                        double pesoA = lerDouble(sc, "Peso da Carga (Kg): ");

                        while (pesoA > capA) {
                            System.out.println(
                                    "Erro: o peso da carga não pode ser maior que a capacidade (" + capA + " Kg).");
                            pesoA = lerDouble(sc, "Digite novamente o Peso da Carga (Kg): ");
                        }

                        AviaoCarga aviao = new AviaoCarga(capA, velA, distA, pesoA, alt, pesoA, auto);
                        transportes.add(aviao);

                        double freteA = aviao.calcularFrete(distA, pesoA);
                        fretes.add(freteA);

                        double prazoA = aviao.calcularPrazoEntrega(distA, velA);
                        prazos.add(prazoA);

                        System.out.printf("Frete: R$ %.2f", freteA);
                        System.out.printf("\nPrazo: %.2f horas\n", prazoA);

                        break;

                    case 3:
                        if (fretes.isEmpty()) {
                            System.out.println("\nNenhum frete calculado ainda.");
                        } else {
                            System.out.println("\nFretes Calculados");
                            for (int i = 0; i < fretes.size(); i++) {
                                System.out.printf("%s - Frete: R$ %.2f - Prazo: %.2f horas%n",
                                        transportes.get(i).getClass().getSimpleName(),
                                        fretes.get(i),
                                        prazos.get(i));

                            }
                        }
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida. Por favor, digite números onde necessário.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                sc.nextLine();
            }
        }

        sc.close();
        System.out.println("Programa encerrado.");
    }

    private static double lerDouble(Scanner sc, String mensagem) {
        double valor = -1;
        while (valor <= 0) {
            System.out.print(mensagem);
            try {
                valor = sc.nextDouble();
                sc.nextLine();
                if (valor <= 0) {
                    System.out.println("Erro: o valor deve ser maior que 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um número válido.");
                sc.nextLine();
            }
        }
        return valor;
    }

    private static int lerInt(Scanner sc, String mensagem) {
        int valor = -1;
        while (valor <= 0) {
            System.out.print(mensagem);
            try {
                valor = sc.nextInt();
                sc.nextLine();
                if (valor <= 0) {
                    System.out.println("Erro: o valor deve ser maior que 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um número inteiro válido.");
                sc.nextLine();
            }
        }
        return valor;
    }
}
