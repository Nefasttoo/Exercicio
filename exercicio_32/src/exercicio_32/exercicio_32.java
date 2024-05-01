package exercicio_32;

import java.util.Scanner;

public class exercicio_32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso, novoPesoA = 15.0 / 100, novoPesoB = 20.0 / 100;

        System.out.println("\n------------------------------------------------------------\n");

        System.out.println("Insira o peso da pessoa: ");
        peso = entrada.nextDouble();

        double novoPesoEg = peso + peso * novoPesoA;
        double novoPesoEm = peso - peso * novoPesoB;

        if (novoPesoEg > peso) {
            System.out.printf("Novo peso após engordar: %.2f\n", novoPesoEg);
            System.out.println("A pessoa engordou.");
            
        } else if (novoPesoEm < peso) { 
            System.out.printf("Novo peso após emagrecer: %.2f\n", novoPesoEm);
            System.out.println("A pessoa emagreceu.");
        }
        
        entrada.close();
    }
}
