import java.util.Scanner;

public class CalculadoraGit {
    static int soma, subt, mult, divi;
    static int x, y;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite x:");
        x = scanner.nextInt();
        System.out.println("Digite y:");
        y = scanner.nextInt();

        soma();
        subt();
        mult();
        divi();

    }

    public static void soma() {
        soma = x + y;
        System.out.println("O resultado da soma é: " + soma);

    }

    public static void subt() {
        subt = x - y;
        System.out.println("O resultado da subtração é: " + subt);

    }

    public static void mult() {
        mult = x * y;
        System.out.println("O resultado da multiplicação é: " + mult);

    }

    public static void divi() {
        divi = x / y;
        System.out.println("O resultado da divisão é: " + divi);

    }
}