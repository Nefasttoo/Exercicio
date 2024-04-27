package exercicio_8;

import java.util.Scanner;
	public class exercicio_8 {
		
		public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		double dep, txjr, vlr, totalvlr;
		
		dep = new Scanner(System.in).nextInt();
		txjr = new Scanner(System.in).nextInt();
		
		vlr = dep * txjr/100;
		totalvlr = dep + vlr;
		
		System.out.println("\nValor do rendimento: " + vlr);
		System.out.println("\nValor total apos do redimento: " + totalvlr);
		
		entrada.close();
		}
	}
	