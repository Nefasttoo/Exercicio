package exercicio_28_cap_5;

import java.util.Scanner;

	public class exercicio_28_cap_5 {
		public static void main(String[] args) {
			
			
			try (Scanner entrada = new Scanner (System.in)) {
								
				System.out.print ("\n----------------------------------------------------\n");
				System.out.println("\nDigite um numero: ");
				int n = entrada.nextInt();
				
				int fatorial = 1;
				
				for (int i = 1; i <= n; i++) {
					//int j;
					fatorial *= i;
					
					System.out.printf("Fatorial de: %d: %d\n", n, fatorial);
				}
				entrada.close();
			}
		}
	}