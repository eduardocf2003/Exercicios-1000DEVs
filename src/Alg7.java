import java.util.Scanner;

public class Alg7 {
    public static void main(String[] args) {
        double peso;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o peso em KG: ");
        peso = teclado.nextFloat();

        double peso15 = (((peso / 100) * 15) + peso);
        double peso20 = (((peso / 100) * 20) + peso);

        System.out.println("Caso a pessoa engorde 15% ficaria com: " + peso15 + " KG");
        System.out.println("Caso a pessoa engorde 20% ficaria com: " + peso20 + " KG");


    }
}
