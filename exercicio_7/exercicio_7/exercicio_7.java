package exercicio_7;

import java.util.Scanner;

	public class exercicio_7 {
		public static void main (String[]args) {
		{
			Scanner entrada = new Scanner (System.in);
		
		double salb, grat = 50, imp, salr;
		salb = entrada.nextDouble();
		imp = salb * 10/100;
		grat = 50;
		salr = salb + grat - imp;
		
		System.out.println("\nSalario a receber: " + salr);
		
		
	}
  }
}