import java.util.Scanner;

public class Alg11 {
    public static void main(String[] args) {
        float litroRefresco;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a QTDE de lts de refresco necessária: ");
        litroRefresco = teclado.nextFloat();

        System.out.println("\n\n");

        float litrosAgua = ((litroRefresco / 100) * 80);
        float litrosMaracuja = ((litroRefresco / 100) * 20);

        System.out.println("Será necessário para fazer " + litroRefresco + " lts de refresco:");
        System.out.println(litrosAgua + " lts de água");
        System.out.println(litrosMaracuja + " lts de concentrado de maracujá");




    }
    
}
