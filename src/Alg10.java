import java.util.Scanner;

public class Alg10 {
    public static void main(String[] args) {
        int anoInicial;
        int anoFinal;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o ano inicial: ");
        anoInicial = teclado.nextInt();

        System.out.print("Digite o ano final: ");
        anoFinal = teclado.nextInt();

        System.out.println("\n\n");

        
        int anos = (anoFinal - anoInicial);
        int meses = (anos * 12);
        int dias = (meses * 30);
        int semanas = (meses * 4);

        System.out.println("A idade desta pessoa em");

        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);
        System.out.println("Semanas: " + semanas);


    


    }
}
