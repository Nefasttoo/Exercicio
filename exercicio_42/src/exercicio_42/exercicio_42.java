package exercicio_42;

	import java.util.Scanner;
		public class exercicio_42 {
			public static void main(String[] args) {
				
				Scanner entrada = new Scanner (System.in);
				double raio, compr, area, vol;
				
				System.out.println("\n******************************************************\n");
				
				System.out.print("Insira o Raio: ");
				raio = entrada.nextDouble();
				
				System.out.print("Comprimento da esfera é: ");
				// C = 2 * Pi * R
				compr = 2 * Math.PI * raio;
				System.out.printf("%.2f", + compr);
				
				System.out.print("\nArea da esfera: ");
				// A = Pi * R²
				area = Math.PI * (raio * raio);
				System.out.printf("%.2f", + area);
				
				System.out.print("\nVolume da esfera: ");
				// V = 3/4 * Pi * R³
				vol = 4.0 /3 * Math.PI * Math.pow(raio, 3);
				System.out.printf("%.2f", + vol);
				
				
			}
		}