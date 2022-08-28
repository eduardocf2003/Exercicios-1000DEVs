import java.util.Scanner;

public class Alg14 {
    public static void main(String[] args) {
        int qtdSanduiches;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de sanduiches: ");
        qtdSanduiches = teclado.nextInt();

        System.out.println("\n\n");

        
        double pesoRecheioQ = ((0.05 * 2) * qtdSanduiches);
        double pesoRecheioP = ((0.05) * qtdSanduiches);
        double pesoHamb = ((0.12) * qtdSanduiches);

        System.out.println("Para produzir " + qtdSanduiches + " sanduiches serão necessários:");
        System.out.printf("%.2f kgs de mussarela \n",pesoRecheioQ);
        System.out.printf("%.2f kgs de presunto \n",pesoRecheioP);
        System.out.printf("%.2f kgs de hamburguer \n",pesoHamb);



    }
}
