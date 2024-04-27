package exercicio_21;

import java.util.Scanner;

	public class exercicio_21 {
		public static void main(String[]args) {
			
			var entrada = new Scanner(System.in);{
			double x, y, z; 
			
			// x = altura em que deseja colocar o quadro; 
			// y = distancia em que devera ficar a escada;
			// z = tamanho da escada; 
			
			System.out.printf("\nDigitar tamanho da escada: ");
			z = entrada.nextDouble();
			
			System.out.printf("\nDigitar altura do quardo a ser colocado: ");
			x = entrada.nextDouble();
			
			y = Math.sqrt(x * x + z * z); 
			
			System.out.printf("\nDistancia da escada da parede é de: %.2f", + y);
			
			entrada.close();
				
			}
		}
	}