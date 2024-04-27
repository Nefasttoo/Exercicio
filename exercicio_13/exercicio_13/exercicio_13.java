package exercicio_13;

import java.util.Scanner; 
	public class exercicio_13 {
		
		private static double polegadas;
		private static double milhas;

		public static void main(String[]args) {
		{
		
		Scanner entrada = extracted(); {
		double pes, jardas;
		
		System.out.println("Digite um numero: ");
		pes = extracted().nextDouble();
		setPolegadas(pes * 12);
		jardas = pes / 3;
		setMilhas(jardas / 1760);
		
		System.out.println("\npolegadas: " + polegadas);
		System.out.println("\njardas: " + jardas);
		System.out.println("\nmilhas: " + milhas);
		
		}
	}
	}

		private static Scanner extracted() {
			return new Scanner(System.in);
		}

		public static double getPolegadas() {
			return polegadas;
		}

		public static void setPolegadas(double polegadas) {
			exercicio_13.polegadas = polegadas;
		}

		public static double getMilhas() {
			return milhas;
		}

		public static void setMilhas(double milhas) {
			exercicio_13.milhas = milhas;
		}
		
}
	
	