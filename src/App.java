import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        Calculadora calc2 = new Calculadora();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite x:");
        calc.x = scanner.nextInt();
        System.out.println("Digite y:");
        calc.y = scanner.nextInt();

        System.out.println("Digite x 2:");
        calc2.x = scanner.nextInt();
        System.out.println("Digite y 2:");
        calc2.y = scanner.nextInt();

        int soma = calc.soma(50,90);
        System.out.println(soma);
        calc.soma();
        calc.subt();
        calc.mult();
        calc.divi();
        System.out.println();
        System.out.println("Calc 2");
        calc2.soma();
        calc2.subt();
        calc2.mult();
        calc2.divi();


    }
}
