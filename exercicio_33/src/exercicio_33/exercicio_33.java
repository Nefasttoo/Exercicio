package exercicio_33;

import java.util.Scanner;
	public class exercicio_33 {
		public static void main(String[] args) {
			
			
			Scanner entrada = new Scanner (System.in);
			
			// M (g) = m (kg) × 1000
			
			double peso, massa, kg = 1000;
			
			System.out.println("\n--------------------------------------------------------\n");
			
			System.out.print("Insira peso corporal (kg): ");
			peso = entrada.nextDouble();
			
			massa  = peso  * kg;
						
			System.out.print("\nPeso corporal: " + massa + " gramas");
			
			entrada.close();
		}
	}