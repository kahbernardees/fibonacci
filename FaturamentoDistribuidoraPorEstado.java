public class FaturamentoDistribuidoraPorEstado {

    public static void main(String[] args) {
        // Valores de faturamento por estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Calcula o faturamento total
        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Calcula e exibe o percentual de cada estado
        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%%n", (faturamentoSP / faturamentoTotal) * 100);
        System.out.printf("RJ: %.2f%%%n", (faturamentoRJ / faturamentoTotal) * 100);
        System.out.printf("MG: %.2f%%%n", (faturamentoMG / faturamentoTotal) * 100);
        System.out.printf("ES: %.2f%%%n", (faturamentoES / faturamentoTotal) * 100);
        System.out.printf("Outros: %.2f%%%n", (faturamentoOutros / faturamentoTotal) * 100);
    }
}