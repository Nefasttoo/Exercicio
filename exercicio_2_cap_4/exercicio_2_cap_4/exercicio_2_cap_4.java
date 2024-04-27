package exercicio_2_cap_4;

import java.util.Scanner;
	public class exercicio_2_cap_4 {
		public static void main (String[]args) {
		{
		
			Scanner entrada = new Scanner(System.in);
			double n1, n2, media;
			//boolean reprovado = false, exame = false, aprovado = false;
			//pode-se usar as declarações ao lado do if, else if e else, entre (), nao precisando declar elas no boolean nas variantes
			
			System.out.print("Digitar 1ª nota: ");
			n1 = entrada.nextDouble();
			
			System.out.print("Digitar 2ª nota: ");
			n2 = entrada.nextDouble();
			
			media = (n1 + n2) / 2;
			
			System.out.println("Media da nota: " + media);
			
			if (media  < 3) {
	            System.out.println("Reprovado");
	        } else if (media < 7) {
	            System.out.println("Exame");
	        } else {
	            System.out.println("Aprovado");
	        }
				
			}
		}
	  }