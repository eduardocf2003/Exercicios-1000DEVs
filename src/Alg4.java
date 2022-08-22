import java.util.Scanner;

public class Alg4 {
    public static void main(String[] args) {
        float numeroescolhido;
        int multiplicador = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número para o calculo da tabuada: ");
        numeroescolhido = teclado.nextFloat();

        System.out.println("Tabuada do + e - para o número 5");
        
        while(multiplicador < 10) {
        System.out.print(numeroescolhido + " + " + multiplicador + " " + "= " + (numeroescolhido + multiplicador));
        System.out.println("  " + numeroescolhido + " - " + multiplicador + " " + "= " + (numeroescolhido - multiplicador));
        multiplicador++;
        }

        while(multiplicador < 10) {
            System.out.print(numeroescolhido + " * " + multiplicador + " " + "= " + (numeroescolhido * multiplicador));
            System.out.println("  " + numeroescolhido + " / " + multiplicador + " " + "= " + (numeroescolhido / multiplicador));
            multiplicador++;
        }
    }
}
