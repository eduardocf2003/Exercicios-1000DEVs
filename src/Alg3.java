import java.util.Scanner;

public class Alg3 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a nota 1: ");
        nota1 = teclado.nextFloat();

        System.out.print("Insira a nota 2: ");
        nota2 = teclado.nextFloat();

        System.out.print("Insira a nota 3: ");
        nota3 = teclado.nextFloat();


        System.out.println("\n\n");
        System.out.println("A média ponderada das notas " + nota1 + " " + (nota2 * 2) + " " + (nota3 * 3));
        System.out.println(" é de: " + nota1 + nota2 + nota3 / 6);
    }
}