package exercicio_13_cap_4;

import java.util.Scanner;

	public class exercicio_13_cap_4 {
		public static void main (String[]args) {
			
			Scanner entrada = new Scanner(System.in);
			double precoProduto, novoPreco = 0;
			double aum1 = 0.05, aum2 = 0.10, aum3 = 0.15;
						
			System.out.println("\nInsira o preço do produto: R$");
			precoProduto = entrada.nextDouble();
			
			System.out.println("Ate R$50,00 = 5% de aumento");
			System.out.println("Entre R$50,00 a R$100,00 = 10% de aumento");
			System.out.println("Acima de R$100,00 = 15% de aumento\n");
			
			if (novoPreco <= 50) {
				novoPreco = precoProduto * (1 + aum1);
			} else if (novoPreco <= 100) {
				novoPreco = precoProduto * (1 + aum2);
			} else {
				novoPreco = precoProduto * (1 + aum3);
			}
			
			if (novoPreco <= 80) {
				System.out.printf("BARATO");
			} else if (novoPreco <= 120) {
				System.out.printf("NORMAL");
			} else if (novoPreco <= 200) {
				System.out.printf("CARO");
			} else {
				System.out.printf("MUITO CARO");
			}
			
			System.out.printf("\nNOVO PREÇO: R$%.2f\n", novoPreco);
		}
	}