package exercicio_36;

import java.util.Scanner;

	public class exercicio_36 {
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			
			// A = (diagonalmaior * diagonalmenor ) / 2
			
			long area, diagonalA, diagonalB;
			
			System.out.print("\n***************************************************\n");
			
			System.out.println("Digite diagonal maior: ");
			diagonalA = entrada.nextLong();
			
			System.out.println("Digite diagonal menor: ");
			diagonalB = entrada.nextLong();
			
			area = (diagonalA * diagonalB) / 2;
			
			System.out.println("A area do losango é: " + area);
			
			entrada.close();
		}
				
		}

