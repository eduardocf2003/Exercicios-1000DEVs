import java.util.Scanner;

public class Alg18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float valorConta;
        
        System.out.print("Informe o valor da conta: R$ ");
        valorConta = (float)teclado.nextFloat();

        System.out.println("\n\n");

        
        
        float valorDiv = (valorConta / 3);
        int valorCarlos = (int)valorDiv;
        int valorAndre = (int)valorDiv;
        float valorFelipe = (valorConta - valorCarlos - valorAndre);

        System.out.println("Carlos pagará: R$ " + valorCarlos);
        System.out.println("Andre pagará: R$ " + valorAndre);
        System.out.println("Felipe pagará: R$ " + valorFelipe);
    }
}
