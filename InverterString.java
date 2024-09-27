import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        // Solicita a entrada da string pelo usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string para ser invertida: ");
        String original = scanner.nextLine();

        // Chama a função que inverte a string
        String invertida = inverterString(original);

        // Exibe o resultado
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    // Função que inverte a string sem usar funções prontas
    public static String inverterString(String str) {
        // Cria um array de caracteres para armazenar a string original
        char[] caracteres = str.toCharArray();
        int n = caracteres.length;

        // Inverte os caracteres manualmente
        for (int i = 0; i < n / 2; i++) {
            // Troca os caracteres das posições i e (n-i-1)
            char temp = caracteres[i];
            caracteres[i] = caracteres[n - i - 1];
            caracteres[n - i - 1] = temp;
        }

        // Converte o array de volta para uma string e retorna
        return new String(caracteres);
    }
}