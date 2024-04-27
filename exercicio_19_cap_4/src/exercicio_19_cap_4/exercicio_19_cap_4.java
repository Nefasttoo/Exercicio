package exercicio_19_cap_4;

import java.util.Scanner;
	public class exercicio_19_cap_4 {
		public static void main (String[]args) {
			
			Scanner entrada = new Scanner (System.in);
			double altura, pesoIdealH, pesoIdealM;
			
			System.out.println("Digite altura da pessoa no seguinte formato ex: (1,32cm): ");
			altura = entrada.nextDouble();
			
			System.out.printf("Peso ideal (Homens)\n");
			pesoIdealH = (72.7 * altura) - 58;
			
			System.out.printf("Peso ideal (kg): %.2f\n", + pesoIdealH);
			
			System.out.printf("\nPeso ideal (Mulheres)\n");
			pesoIdealM = (62.1 * altura) - 44.7;
			
			System.out.printf("Peso ideal (kg): %.2f", + pesoIdealM);
			
			entrada.close();
		}
	}