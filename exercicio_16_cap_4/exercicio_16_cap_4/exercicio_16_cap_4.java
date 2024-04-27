package exercicio_16_cap_4;

	import java.util.Scanner;
		public class exercicio_16_cap_4 {
			public static void main (String[]args) {
				
				Scanner entrada = new Scanner (System.in);
				double precoAtual, desc1 = 0, desc2 = 0.10, desc3 = 0.15, novoPreco;
				
				System.out.print("Insira valor do produto: R$");
				precoAtual = entrada.nextDouble();
				
				if (precoAtual <=30) {
					novoPreco = precoAtual * (1 - desc1);
				} else if (precoAtual <=100) {
					novoPreco = precoAtual * (1 - desc2);
				} else {
					novoPreco = precoAtual * (1 - desc3);
				}
				
				System.out.printf("\nPreco com desconto: R$ %.2f", novoPreco);
				
				entrada.close();
			}
		}