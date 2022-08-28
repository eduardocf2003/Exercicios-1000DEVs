import java.util.Scanner;

public class Alg5 {
    public static void main(String[] args) {
    int numero1;
    int numero2;
    float resultado;
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe o valor 1: ");
    numero1 = teclado.nextInt();

    System.out.print("Informe o valor de 2: ");
    numero2 = teclado.nextInt();

    resultado = ((float) numero1 / numero2);

    System.out.println("A divisão de " + numero1 + " por " + numero2 + "  é " + resultado);
    }

    
}
