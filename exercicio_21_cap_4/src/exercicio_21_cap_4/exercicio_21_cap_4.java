package exercicio_21_cap_4;

import java.util.Scanner;
	public class exercicio_21_cap_4 {
		public static void main (String[]args) {
			
			Scanner entrada = new Scanner (System.in);
			double precoProduto, codigo = 0;
			
			System.out.print("Insira o preço do produto:R$ ");
			precoProduto = entrada.nextDouble();
			
			System.out.println("Insira o codigo de origem, sendo apenas numeros real e inteiro: \n");
			System.out.println("1. Procedencia (Sul)");
			System.out.println("2. Procedencia (Norte)");
			System.out.println("3. Procedencia (Lest)");
			System.out.println("4. Procedencia (Oeste)");
			System.out.println("5 ou 6. Procedencia (Nordeste)");
			System.out.println("7 a 9. Procedencia (Suldeste)");
			System.out.println("10 a 20. Procedencia (Centro-oeste)");
			System.out.println("21 a 30. Procedencia (Nordeste)");
					
			codigo = entrada.nextInt();
			
			if (codigo == 1) {
				System.out.println("Procedencia Sul");
			} else if (codigo == 2) {
				System.out.println("Procedencia Norte");
			} else if (codigo == 3) {
				System.out.println("Procedencia Lest");
			} else if (codigo == 4) {
				System.out.println("Procedencia Oeste");
			} else if (codigo == 5 || codigo == 6) {
	            System.out.println("Procedência: Nordeste");
	        } else if (codigo >= 7 && codigo <= 9) {
	            System.out.println("Procedência: Sudeste");
	        } else if (codigo >= 10 && codigo <= 20) {
	            System.out.println("Procedência: Centro-Oeste");
	        } else if (codigo >= 21 && codigo <= 30) {
	            System.out.println("Procedência: Nordeste");
	        } else {
	            System.out.println("Código de procedência inválido");
	        }
			
			System.out.printf("Preco do produto R$" + precoProduto);
			entrada.close();
		}
	}