package exercicio_31;

import java.util.Scanner;

	public class exercicio_31 {
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			double salarioFixo, comissao = 4.0 /100, salarioFinal, vendas;
			
			System.out.println("\n-------------------------------------------------------\n");
			
			System.out.print("Insira valor do Salario fixo:R$ ");
			salarioFixo = entrada.nextDouble();
			
			System.out.print("Insira o valor das vendas: R$ ");
	        vendas = entrada.nextDouble();
	        
			salarioFinal = salarioFixo + salarioFixo * comissao;
						
			System.out.printf("Salario final:R$ %.2f ", + salarioFinal);
			
			System.out.printf("\nValor da comissão: R$ %.2f\n", vendas * comissao);
			
		}
		
	}