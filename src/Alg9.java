import java.util.Scanner;

public class Alg9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Área do trapézio
        
        float baseMaiorTrap;
        float baseMenorTrap;
        float alturaTrap;
        
        System.out.println("Área do trapézio:");
        
        System.out.print("Informe o valor da base maior: ");
        baseMaiorTrap = teclado.nextFloat();

        System.out.print("Informe o valor da base menor: ");
        baseMenorTrap = teclado.nextFloat();

        System.out.print("Informe o valor da altura: ");
        alturaTrap = teclado.nextFloat();

        float areaTrap = (((baseMaiorTrap + baseMenorTrap) * alturaTrap) / 2);

        System.out.print("A àrea do trapézio é: " + areaTrap);
        System.out.print("\n\n");
        

        //Area do quadrado

        float valorLadQuad;

        System.out.println("Àrea do quadrado:");

        System.out.print("Informe o valor de um dos lados: ");
        valorLadQuad = teclado.nextFloat();

        float areaQuad = (valorLadQuad * valorLadQuad);

        System.out.print("A àrea do quadrado é: " + areaQuad);
        System.out.println("\n\n");


        //Área do retangulo

        float largRetangulo;
        float altRetangulo;

        System.out.println("Área do retangulo:");

        System.out.print("Informe o valor da largura: ");
        largRetangulo = teclado.nextFloat();

        System.out.print("Informe o valor da altura: ");
        altRetangulo = teclado.nextFloat();

        float areaRetangulo = (largRetangulo * altRetangulo);

        System.out.print("A área do retangulo é: " + areaRetangulo);
        System.out.println("\n\n");


        //Area do circulo
        
        float raioCirculo;

        System.out.println("Àrea do circulo: ");

        System.out.print("Informe o valor do raio:  ");
        raioCirculo = teclado.nextFloat();

        double areaCirculo = (3.14 * (raioCirculo * raioCirculo));

        System.out.print("A área do circulo é: " + areaCirculo);
        System.out.println("\n\n");


        //Area do triangulo

        float baseTriang;
        float alturaTriang;

        System.out.println("Àrea do triangulo:");

        System.out.print("Informe o valor da base: ");
        baseTriang = teclado.nextFloat();

        System.out.print("Informe o valor da altura: ");
        alturaTriang = teclado.nextFloat();

        float areaTriang = ((baseTriang * alturaTriang) / 2);

        System.out.println("A área do triangulo é: " + areaTriang);





    }
}
