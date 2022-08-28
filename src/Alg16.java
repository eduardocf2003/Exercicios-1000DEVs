import java.util.Scanner;

public class Alg16 {
    public static void main(String[] args) {
        double faturamentoAnt;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do faturamento anterior: ");
        faturamentoAnt = teclado.nextDouble();

        System.out.println("\n\n");


        double metaFat = (faturamentoAnt + ((faturamentoAnt / 100) * 20));
        double difFat = (metaFat - faturamentoAnt);

        System.out.printf("A meta do próximo mês é: R$ %.2f \n",metaFat);
        System.out.printf("Um aumento de R$ %.2f \n", difFat);

        System.out.println("Quantidade de peças a serem vendidas para atingirmos a meta:");
        System.out.println("\n\n");

        
        double metaProd1 = (difFat / 150);
        double metaProd2 = (difFat/ 220);
        double metaProd3 = (difFat / 97);

        System.out.printf("Produto 1: %.2f peças \n",metaProd1);
        System.out.printf("Produto 2: %.2f peças \n",metaProd2);
        System.out.printf("Produto 3: %.2f peças \n",metaProd3);

    }
}
