package exercicio_20_cap_4;

import java.util.Scanner;
	public class exercicio_20_cap_4 {
		public static void main (String[]args) {
			
			Scanner entrada = new Scanner (System.in);
			double idadeNadador;
			
			System.out.println("\nInserir a idade: ");
			idadeNadador = entrada.nextDouble();
			
			if (idadeNadador < 5) {
				System.out.printf("Menor que 5 anos");
			} else if (idadeNadador <=7) {
				System.out.printf("Categoria: Infantil", args);
			} else if (idadeNadador <=10) {
				System.out.printf("Categoria: Juvenil", args);
			} else if (idadeNadador <=15) {
				System.out.printf("Categoria: Adolescente", args);
			} else if (idadeNadador <=30) {
				System.out.printf("Categoria: Adulto", args);
			} else {
				System.out.printf("Categoria: Sênior", args);
			}
			
			entrada.close();
	}
	}