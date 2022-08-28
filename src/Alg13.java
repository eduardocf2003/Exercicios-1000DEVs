import java.util.Scanner;

public class Alg13 {
    public static void main(String[] args) {
        int qtdLatas;
        int qtdGarrafas;
        int qtdGarrafas2l;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de latas de 350ml: ");
        qtdLatas = teclado.nextInt();

        System.out.print("Digite a quantidade de garrafas de 600ml: ");
        qtdGarrafas = teclado.nextInt();

        System.out.print("Digite a quantidade de garrafas de 2lts: ");
        qtdGarrafas2l = teclado.nextInt();

        System.out.println("\n\n");


        double totalLitrosLata = (qtdLatas * 0.35);
        double totalLitrosGar = (qtdGarrafas * 0.6);
        double totalLitrosGar2 = (qtdGarrafas2l * 2);

        double totalLitros = (totalLitrosLata + totalLitrosGar + totalLitrosGar2);

        System.out.println("A quantidade total de litros é: " + totalLitros);




    }
}
