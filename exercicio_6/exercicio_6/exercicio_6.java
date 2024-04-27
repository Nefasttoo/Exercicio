package exercicio_6;

import java.util.Scanner;
	public class exercicio_6 {
		
		public static void main (String[]args){
		
			var entrada = new Scanner(System.in);
		System.out.println("\nSalario base: ");
		double salariobase, perc = 5, imp = 7, salarioreceber;
		salariobase = entrada.nextDouble();
		perc = salariobase * 5/100;
		imp = salariobase * 7/100;
		salarioreceber = salariobase + perc - imp;
		
		System.out.print("Salario a receber: " + salarioreceber);
		
		entrada.close();
		
		}
	}

	
