public class Calculadora {
    int soma, subt, mult, divi;
    int x, y;



    public void soma() {
        soma = x + y;
        System.out.println("O resultado da soma é: " + soma);

    }

    public int soma(int x,int y) {
        soma = x + y;
        return soma;
    }

    public void subt() {
        subt = x - y;
        System.out.println("O resultado da subtração é: " + subt);

    }

    public void mult() {
        mult = x * y;
        System.out.println("O resultado da multiplicação é: " + mult);

    }

    public void divi() {
        divi = x / y;
        System.out.println("O resultado da divisão é: " + divi);

    }
}