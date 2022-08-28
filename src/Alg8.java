import java.util.Scanner;

public class Alg8 {
    public static void main(String[] args) {
        float salarioInicial;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o salário: ");
        salarioInicial = teclado.nextFloat();

        float salarioReajustado = (((salarioInicial / 100) * 15) + salarioInicial);
        float descontoInss = ((salarioReajustado / 100) * 11);
        float descontoFgts = ((salarioReajustado / 100) * 8);
        float totalDescontos = (descontoInss + descontoFgts);
        float salarioFinal = (salarioReajustado - totalDescontos);

        System.out.println("\n\n");
        System.out.println("Salário inicial: " + salarioInicial);
        System.out.println("Salário reajustado: " + salarioReajustado);
        System.out.println("Desconto 11% INSS: " + descontoInss);
        System.out.println("Desconto 8% FGTS: " + descontoFgts);
        System.out.println("Total descontos INSS+FGTS: " + totalDescontos);
        System.out.println("Salário Final: " + salarioFinal);



    }
}
