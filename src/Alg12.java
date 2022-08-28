import java.util.Scanner;

public class Alg12 {
    public static void main(String[] args) {
        int qtdFrangos;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de frangos: ");
        qtdFrangos = teclado.nextInt();

        System.out.println("\n\n");

        double totalChip = (qtdFrangos * 4);
        double totalAlim = ((qtdFrangos * 2) * 3.50);

        System.out.println("O valor total para identificar os frangos é: R$ " + (totalChip + totalAlim));


    }
}
