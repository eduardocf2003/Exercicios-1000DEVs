import java.util.Scanner;

public class Alg19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int diaEscolhido;
        int mesEscolhido;

        System.out.print("Digite o dia: ");
        diaEscolhido = teclado.nextInt();

        System.out.print("Digite o mês: ");
        mesEscolhido = teclado.nextInt();

        float diasTotais = (((mesEscolhido * 30) - 30) + diaEscolhido);

        System.out.println("A quantidade de dias que se passaram foi " + diasTotais + "dias");

    }
}
