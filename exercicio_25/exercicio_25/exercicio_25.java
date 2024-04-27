package exercicio_25;
	import java.util.Scanner;
		public class exercicio_25 {
		public static void main(String[]args) {
		{
			Scanner entrada = new Scanner(System.in);
			double custo_conv, preco_conv;
			int qdt_conv;
			
			
			System.out.print("Digite o custo do convite: ");
			custo_conv = entrada.nextDouble();
			
			System.out.print("Digite o preço do convite: ");
			preco_conv = entrada.nextDouble();
			
			//quantidade de convites a serem vendidos
			qdt_conv = (int) (preco_conv / custo_conv);
			
			System.out.printf("Quantidade de convites a serem vendidos é de: " + qdt_conv);
			
		entrada.close();	
		}
	}
}