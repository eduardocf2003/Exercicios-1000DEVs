import java.util.Scanner;
import java.lang.Math;

public class Alg4 {
    public static void main(String[] args) {
        float numeroescolhido;
        int coeficiente = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número para o calculo da tabuada: ");
        numeroescolhido = teclado.nextFloat();

        System.out.println("Tabuada do + e - para o número ");
        
        while(coeficiente < 10) {
        System.out.print(numeroescolhido + " + " + coeficiente + " " + "= " + Math.abs(numeroescolhido + coeficiente));
        System.out.println("  " + numeroescolhido + " - " + coeficiente + " " + "= " + Math.abs(numeroescolhido - coeficiente));
        coeficiente++;
        }
        
        coeficiente = 0;

        while(coeficiente < 10) {
            System.out.print(numeroescolhido + " x " + coeficiente + " " + "= " + Math.abs(numeroescolhido * coeficiente));
            System.out.println("  " + numeroescolhido + " / " + coeficiente + " " + "= " + Math.abs(numeroescolhido / coeficiente));
            coeficiente++;
            }
        
    }
}
