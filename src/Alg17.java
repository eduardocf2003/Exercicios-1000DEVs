import java.util.Scanner;

public class Alg17 {
    public static void main(String[] args) {
        int qtdPaes;
        int qtdBroas;
        double valorReforma;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de pães vendidos: ");
        qtdPaes = teclado.nextInt();

        System.out.print("Digite a quantidade de broas vendidas: ");
        qtdBroas = teclado.nextInt();

        System.out.print("Digite o valor da reforma: ");
        valorReforma = teclado.nextDouble();

        System.out.println("\n\n");


        double fatPaes = (qtdPaes * 0.12);
        double fatBroas = (qtdBroas * 1.60);
        double fatDiario = (fatPaes + fatBroas);
        double deposito = ((fatDiario / 100) * 10);
        double diasReforma = (valorReforma / deposito);

        System.out.printf("Faturamento com a venda de pães: %.2f \n",fatPaes);
        System.out.printf("Faturamento com a venda de broas: %.2f \n",fatBroas);
        System.out.printf("Faturamento diário (pães + broas): %.2f \n",fatDiario);
        System.out.printf("Valor do depósito na poupança: %.2f \n",deposito);
        System.out.printf("Para pagar a reforma serão necessários: %.0f dias \n",diasReforma);
    }
}
