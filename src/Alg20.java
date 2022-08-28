import java.util.Scanner;

public class Alg20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroDig;

        System.out.print("Digite um numero de 4 digitos: ");
        numeroDig = teclado.nextInt();

        int milhares = ((int)numeroDig / 1000);
        int centenas = ((int)(numeroDig - (milhares * 1000)) / 100);
        int dezenas = ((int)(numeroDig - (milhares * 1000) - (centenas * 100)) / 10);
        int unidades = ((int)(numeroDig - (milhares * 1000) - (centenas * 100) - (dezenas * 10)) / 1);

        System.out.println("Milhares: " + milhares);
        System.out.println("Centenas: " + centenas);
        System.out.println("Dezenas: " + dezenas);
        System.out.println("Unidades: " + unidades);
    }
}
