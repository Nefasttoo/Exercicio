package exercicio_9;

import java.util.Scanner;
	public class exercicio_9{
		public static void main(String[]args) {
		{
		var entrada = new Scanner(System.in);
		double base, altura, area;
		
		base = new Scanner(System.in).nextInt();
		altura = new Scanner(System.in).nextInt();
		
		
		area = (base * altura)/2;
		System.out.println("Area do triangulo: " + area);
		
		
		entrada.close();
		}
	  }
	}