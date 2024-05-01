package exercicio_30;

import java.util.Scanner;
	
	public class exercicio_30 {
		public static void main(String[] args) {
			
			
			Scanner entrada = new Scanner (System.in);
			double precoProduto, novoPreco, desc = 0.10;
			
			System.out.println("\n--------------------------------------------------------\n");
			
			System.out.print("Insira preco do produto R$ ");
			precoProduto = entrada.nextDouble();
			
			novoPreco = precoProduto - desc;
			
			System.out.printf("Novo preco: R$ %.2f", + novoPreco);
			
			entrada.close();
		}
	}