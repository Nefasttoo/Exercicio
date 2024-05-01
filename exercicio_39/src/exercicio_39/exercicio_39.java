package exercicio_39;

import java.util.Scanner;
	public class exercicio_39 {
		public static void main(String[] args) {
			
			
			Scanner entrada = new Scanner (System.in);
			
			int nasc, anoAtual, diferenca, meses = 12, semanas = 47, dias = 365;
			
			System.out.println("\n*************************************************\n");
			
			System.out.println("Insira sua data de nascimento apenos o ano ex: 1990");
			nasc = entrada.nextInt();
			
			System.out.println("Insira o ano atual ex: 2020");
			anoAtual = entrada.nextInt();
			
			diferenca = anoAtual - nasc;
			
			meses = diferenca * meses;
			semanas = diferenca * semanas;
			dias = diferenca * dias;
			
			System.out.println("Sua idade é de: " + diferenca);
			System.out.println("Sua idade em meses é de: " + meses);
			System.out.println("Sua idade em semanas é: " + semanas);
			System.out.println("Sua idade em dias é: " + dias);
			
			entrada.close();
		}
	}