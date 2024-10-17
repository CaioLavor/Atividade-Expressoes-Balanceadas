import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma expressão para verificar se está balanceada:");
        String input = scanner.nextLine();

        if (Verificador.isBalanced(input)) {
            System.out.println("A expressão está balanceada.");
        } else {
            System.out.println("A expressão não está balanceada.");
        }
        scanner.close();
    }
}