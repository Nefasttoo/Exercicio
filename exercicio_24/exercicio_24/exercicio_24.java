package exercicio_24;

import java.util.Scanner;
	public class exercicio_24 {
		public static void main(String[]args) {
		
			Scanner entrada = new Scanner(System.in); {
			double horas, h, min, conversao;
			
			System.out.print("Digite a horas desejada: ");
			horas = entrada.nextDouble();
			
			h = (int) horas;
			min = horas - h;
			conversao = (h * 60) + (min * 100);
			
			System.out.printf("Conversao: " + conversao + "minutos");
			entrada.close();
			
			}
		} 	
		}