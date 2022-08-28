import java.util.Scanner;

public class Alg15 {
    public static void main(String[] args) {
        int horasNorm;
        int horasExt;
        int dependentes;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade total de horas normais: ");
        horasNorm = teclado.nextInt();

        System.out.print("Digite a quantidade total de horas extras: ");
        horasExt = teclado.nextInt();

        System.out.print("Digite a quantidade total de dependentes menores que 6 anos: ");
        dependentes = teclado.nextInt();

        System.out.println("\n\n");

        
        int valorNorm = (horasNorm * 10);
        int valorExtra = (horasExt * 15);
        int valorDepen = (dependentes * 90);
        float salLiquido = (valorNorm - ((valorNorm / 100) * 11));
        float salFinal = (salLiquido + valorDepen + valorExtra);

        System.out.println("Horas normais: R$ " + valorNorm);
        System.out.println("Adicional de Horas Extras: R$ " + valorExtra);
        System.out.println("Adicional de Dependents: R$ " + valorDepen);
        System.out.println("Salário liquido (Horas normais - desconto): R$ " + salLiquido);
        System.out.println("Salário Final: R$ " + salFinal);


    }
}
