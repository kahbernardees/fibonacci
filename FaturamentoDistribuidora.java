import java.util.Scanner;

public class FaturamentoDistribuidora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de dias no mês
        System.out.print("Informe o número de dias no mês: ");
        int diasNoMes = scanner.nextInt();

        // Vetor para armazenar o faturamento diário
        double[] faturamento = new double[diasNoMes];
        
        // Preenche o vetor com os valores de faturamento
        System.out.println("Informe o valor de faturamento para cada dia:");
        for (int i = 0; i < diasNoMes; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            faturamento[i] = scanner.nextDouble();
        }

        // Variáveis para calcular o menor, maior e soma para a média
        double menorValor = faturamento[0];
        double maiorValor = faturamento[0];
        double somaFaturamento = 0;

        // Itera sobre o vetor para encontrar o menor, maior e calcular a soma
        for (double valor : faturamento) {
            if (valor < menorValor) {
                menorValor = valor;
            }
            if (valor > maiorValor) {
                maiorValor = valor;
            }
            somaFaturamento += valor;
        }

        // Calcula a média mensal
        double mediaMensal = somaFaturamento / diasNoMes;

        // Contador para os dias com faturamento superior à média
        int diasAcimaDaMedia = 0;
        for (double valor : faturamento) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        // Exibe os resultados
        System.out.println("\nResultados:");
        System.out.printf("Menor valor de faturamento: %.2f%n", menorValor);
        System.out.printf("Maior valor de faturamento: %.2f%n", maiorValor);
        System.out.printf("Número de dias com faturamento acima da média mensal: %d%n", diasAcimaDaMedia);

        scanner.close();
    }
}