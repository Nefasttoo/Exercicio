
/*
 * Contagem regressiva:
 * Escreva um programa que solicita ao usuário um número inteiro positivo e então conta de trás para frente até zero, imprimindo cada número no console.Exemplo de saída:
 */
package gpt_estrutura_de_repeticao_1;

import java.util.Iterator;
import java.util.Scanner;
	public class gpt_estrutura_de_repeticao_1 {
		public static void main(String[] args) {
			
			
			Scanner entrada = new Scanner (System.in);
			
			int num;
			
			System.out.println("Digite um numero: ");
			num = entrada.nextInt();
			
			for (int i = num; i >= 0; i--) {
				System.out.println(i);
				
			}
			
		}
	}