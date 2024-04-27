package exercicio_18;

	import java.util.Scanner;
		public class exercicio_18 {
			public static void main(String[]args)
			{
				Scanner entrada = new Scanner(System.in);
				double  gato1, gato2, racao_c, peso_racao, racao_f;
				
				
				System.out.print("PESO DO SACO DE RAÇÃO (em kg): ");
				peso_racao = entrada.nextDouble();
				
				System.out.print("Digite a quantidade de racao fornecida ao gato 1: ");
				gato1 = entrada.nextDouble();
				
				System.out.print("Digite a quantidade de racao fornecida ao gato 2: ");
				gato2 = entrada.nextDouble();
				
				racao_c = (gato1 + gato2) * 5;				
				System.out.printf("\nRação consumida em 5 dias: %.2f kg", racao_c);
				
				racao_f = racao_c - peso_racao;
				System.out.printf("\nRacao restante no saco: %.2f kg", racao_f);
				entrada.close();
			}
			
		}