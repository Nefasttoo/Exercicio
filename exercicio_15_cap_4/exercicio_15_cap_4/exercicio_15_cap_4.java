package exercicio_15_cap_4;

	import java.util.Scanner;
	public class exercicio_15_cap_4 {
		public static void main (String[]args) {
			
			Scanner entrada = new Scanner (System.in);
			double poup = 0.03, fixa = 0.04, valorF = 0, valorE;
			int opcoes;

			//valorf = valor final, valorE = valor envestimento
			System.out.printf("\nINSIRA O VALOR PARA INVESTIMENTO R$: \n");
			valorE = entrada.nextDouble();
			
			 System.out.println("Escolha a operacao:");
		     System.out.println("1. Poupança");
		     System.out.println("2. Renda Fixa");
		     System.out.print("Opcoes: ");
		     
			opcoes = entrada.nextInt();
			double resultado = 0;
			
			switch (opcoes) {
				case 1:
					resultado = valorF = valorE * (1 + poup);
				break;
				case 2:
					resultado = valorE * (1 + fixa);
				break;
			default:
                System.out.println("Opcao invalida.");
                System.exit(0);
			}
			
			if (valorE < 0) {
				System.out.println("Erro valor inserido");
				System.exit(0);
			} 
			
			System.out.printf("Valor de retorno investimento: R$ %.2f", + resultado);
			entrada.close();
		}
	}