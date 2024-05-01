package exercicio_43;

	import java.util.Scanner;
	
		public class exercicio_43 {
			
			public static void main(String[] args) {
				
				Scanner entrada = new Scanner (System.in);
				double celsus, f;
					
				// F = ((180 * (C + 32)) / 100)
					
				System.out.print("Insira a temperatura em Celsus: ");
				celsus = entrada.nextDouble();
				
				f = (9.0 / 5) * celsus + 32;
								
				System.out.printf("temperatura em Farhenheit: " + f + "F");
				
				entrada.close();
				
			}
		}