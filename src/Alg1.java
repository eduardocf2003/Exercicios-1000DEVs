import java.util.Scanner;

public class Alg1 {
    public static void main(String[] args) {
        float frente;
        float lateral;
        float valorm2;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos metros o terreno possui de frente? ");
        frente = teclado.nextFloat();

        System.out.print("Quantos metros o terreno possui de lateral? ");
        lateral = teclado.nextFloat();

        System.out.print("Qual o valor do metro? ");
        valorm2 = teclado.nextFloat();

        System.out.print("\n\n");
        System.out.print("O terreno que possuí " + frente + " m de frente e ");
        System.out.print(lateral + " m de lateral tem ");
        System.out.println((frente * lateral) + " metros quadrados de área total.");

        System.out.println("O valor desse terreno é de " + (frente * lateral * valorm2) + " Reais.");
    }
}