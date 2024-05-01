package exercicio_44;

import java.util.Scanner;
	public class exercicio_44 {
		
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			
			double M1, M2, B1, B2, A1, A2, W;
			// M² = 18W
			
			System.out.println("Comodo 1");
			System.out.println("Calculando a area: ");
			System.out.print("Insira base: ");
				M1 = entrada.nextDouble();
			System.out.print("Insira altura: ");
				M2 = entrada.nextDouble();
			
			A1 = M1 * M2;
			
			System.out.println("Area do comodo 1 é: " + A1 + "\n");
			
			System.out.println("**************************************************\n");
			
			System.out.println("Comodo 2");
			System.out.println("Calculando a area: ");
			System.out.print("Insira base: ");
				B1 = entrada.nextDouble();
			System.out.print("Insira altura: ");
				B2 = entrada.nextDouble();
			
			A2 = B1 * B2;
			
			System.out.println("Area do comodo 2 é: " + A2 + "\n");
			
			System.out.println("**************************************************\n");
			
			W = (A1 + A2) * 18;
			
			System.out.println("Potencia em Watts: " + W + " watts");
			
			
			entrada.close();
		}
	}