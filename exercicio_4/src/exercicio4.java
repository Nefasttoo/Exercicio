//module exercicio4 {}

import java.util.Scanner;

	public class exercicio4 {
		public static void main (String[]args) {
			var entrada = new Scanner(System.in); // Scanner no lugar do var.
			
			double sal, novosal;
			sal = entrada.nextDouble();
			novosal = sal + sal * 25 / 100;
			
			System.out.println("Novo salario: " + novosal);
			
			entrada.close();
		}
	}