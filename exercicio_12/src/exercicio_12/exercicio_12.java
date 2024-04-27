package exercicio_12;

import java.util.Scanner;

	public class exercicio_12 {
		public static void main(String[]args) {
		{
		
		Scanner entrada = extracted();
		double x, y = 0;
		System.out.println("Escreva 1 numero: ");
		
		x = extracted().nextDouble();
		x = Math.pow(x, y);
		
		System.out.println("Escreva 2 numero: ");		
		
		y = extracted().nextDouble();
		y = Math.pow(y, x);
		
		
		
		System.out.printf("x, y" + x, y);
		
		//double potenciaX = Math.pow(x, y); // Calcula x elevado à potência de y
        //double potenciaY = Math.pow(y, x); // Calcula y elevado à potência de x
        
        //System.out.printf("O resultado de %.2f elevado a %.2f é: %.2f\n", x, y, potenciaX);
        //System.out.printf("O resultado de %.2f elevado a %.2f é: %.2f\n", y, x, potenciaY);
        
		entrada.close();
		}
	}

		private static Scanner extracted() {
			return new Scanner(System.in);
		}
	}