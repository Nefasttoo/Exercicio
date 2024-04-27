package exercicio_18_cap_4;

import java.util.Scanner;
	public class exercicio_18_cap_4 {
		public static void main (String[]args) {
			
			Scanner entrada = new Scanner (System.in);
			int idade;
						
			System.out.printf("\nDigite a idade: ");
			idade = entrada.nextInt();
			
			if (idade > 18) {
				System.out.printf("Maior de 18");
			} else {
				System.out.printf("Menor de 18");
			}
			
			entrada.close();
		}
	}