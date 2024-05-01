package exercicio_48;

import java.util.Scanner;
	public class exercicio_48 {
		public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double angA, angB, angC;
		
		// soma dos ângulos de um triângulo é 180 graus
		
		System.out.print("Insira angulo A: ");
		angA = entrada.nextDouble();
		
		System.out.print("Insira angulo A: ");
		angB = entrada.nextDouble();
		
		angC = 180 - angA - angB;

        System.out.println("A medida do terceiro ângulo é: " + angC);
        
        entrada.close();
		}
	}





/* Faça um programa que receba a medida de dois ângulos de um triângulo, calcule e mostre a medida doterceiro ângulo. Sabe-se que a soma dos ângulos de um
triângulo é 180 graus. */