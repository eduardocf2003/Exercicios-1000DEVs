import java.util.Scanner;

public class Alg2 {
    public static void main(String[] args) {
        float salarioMin;
        float salarioFun;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor do salário mínimo: ");
        salarioMin = teclado.nextFloat();

        System.out.print("Insira o valor do salário do funcionário: ");
        salarioFun = teclado.nextFloat();

        
        System.out.println("\n\n");
        System.out.println("O funcionário recebe " + (salarioFun / salarioMin) + " salários minimos!");


    }
}
