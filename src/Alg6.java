import java.util.Scanner;

public class Alg6 {
    public static void main(String[] args) {
        int numCavalos;
        float valorFerradura;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de cavalos: ");
        numCavalos = teclado.nextInt();

        System.out.print("Informe o valor de cada ferradura: ");
        valorFerradura = teclado.nextFloat();

        int totalFerraduras = (numCavalos * 4);
        float valorTotal = (totalFerraduras * valorFerradura);

        System.out.println("A quantidade de ferraduras necessárias: " + totalFerraduras);
        System.out.println("Valor total para a compra das ferraduras: R$ " + valorTotal);

    }
}
