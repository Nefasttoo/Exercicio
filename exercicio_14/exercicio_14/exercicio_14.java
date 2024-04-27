package exercicio_14;

import java.util.Scanner;

	public class exercicio_14 {
		public static void main(String[]args) {
		{
			double anonsc, anoatu, Idade, ano2050;
			
			System.out.print("Digite um ano atual: ");
			anonsc =  extracted().nextInt();
			System.out.print("Digite um ano nascimento: ");
			anoatu =  extracted().nextInt();
			
			Idade = anonsc - anoatu;
			ano2050 = 2050 - anonsc;
			
			
			System.out.print("\nidade: " + Idade);
			System.out.print("\nNo ano de 2050: " + ano2050);
		
			
		}
		}

		private static Scanner extracted() {
			return new Scanner(System.in);
		}
		
	}