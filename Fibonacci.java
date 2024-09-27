import java.util.Scanner;

public class Fibonacci {

    // Método que verifica se o número pertence à sequência de Fibonacci
    public static boolean pertenceFibonacci(int n) {
        // Início da sequência de Fibonacci
        int fib1 = 0;
        int fib2 = 1;
        
        // Se o número informado for 0 ou 1, já pertence à sequência
        if (n == 0 || n == 1) {
            return true;
        }
        
        // Gera a sequência até que o número ultrapasse o valor informado
        while (fib2 < n) {
            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }
        
        // Verifica se o número informado é igual ao último número gerado da sequência
        return fib2 == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que informe um número
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        
        // Chama o método para verificar se o número pertence à sequência de Fibonacci
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
}