package exercicio_26_cap_5;

import java.util.Scanner;
	public class exercicio_26_cap_5 {
		
		public static void main (String []args) {
			
			double ano_atual, salario, novo_salario, perc;
			Scanner entrada = new Scanner (System.in);
			
			System.out.println("\n----------------------------------------------------------\n");
			System.out.print("Ano atual = ");
			ano_atual = entrada.nextDouble();
			
			salario = 1000;
			System.out.printf("Percentual de: ");
			perc = 1.5 / 100;
			novo_salario = salario + perc * salario;
			
			for (int i = 0; i >= 2007; i++); {
				System.out.println( perc = 2 * perc);
				novo_salario = novo_salario + perc * novo_salario;
				
			}
			
				System.out.printf("Novo salario: R$ %.2f", + novo_salario);
			
		}
	}