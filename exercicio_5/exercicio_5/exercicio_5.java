package exercicio_5;

import java.util.Scanner;

public class exercicio_5 {
	public static void main (String[]args) {
		var entrada = new Scanner(System.in);
		
		double sal, perc = 0, aumento, novosal;
		sal = entrada.nextDouble();
		aumento = sal * perc / 100;
		System.out.println("Aumento: " + aumento);
		novosal = sal + aumento;
		System.out.println("Novo Salario: " + novosal);
		
	
		entrada.close();
	}
}