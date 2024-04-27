package exercicio_10_cap_4;
	import java.util.Scanner;
	public class exercicio_10_cap_4 {
		public static void main (String[]args) {
			Scanner entrada = new Scanner (System.in);
			
			double custo_f, preco_f1, preco_f2, preco_f3;
				double porc_dis1 = 0.5, porc_dis2 = 0.10, porc_dis3 = 0.15;
				double porc_imp1 = 0, porc_imp2 = 0.15, porc_imp3 = 0.20;
				
			//custo_f = custo de fabrica; porc_imp = porcentagem de impostos (individual); porc_disc = porcentagem do distribuidor (individual);
				
			System.out.println("\nEnsira o preço de custo do veiculo: ");
			custo_f = entrada.nextDouble();
			
			System.out.println("Até R$12.000,00");
			System.out.println("Entre R$12.000,00 e R$ 25.000,00");
			System.out.println("Acima de R$25.000,00\n");
			
			preco_f1 = custo_f * (1 / porc_dis1 + porc_imp1);
			preco_f2 = custo_f * (1 / porc_dis2 + porc_imp2);
			preco_f3 = custo_f * (1 / porc_dis3 + porc_imp3);
			
			System.out.printf("\nPreco final ao consumir com os impostos: R$ %.2f", + preco_f1);
			System.out.printf("\nPreco final ao consumir com os impostos: R$ %.2f", + preco_f2);
			System.out.printf("\nPreco final ao consumir com os impostos: R$ %.2f", + preco_f3);
			
			if (custo_f < 0) {
	            System.out.println("\nO valor do custo de fabrica não pode ser negativo.");
	            System.exit(0);
	        }
			if (custo_f <= 12000) {
				   System.out.printf("\nPreço ao consumidor: R$ %.2f",  preco_f1); 
			} else if (custo_f <=25000){
				   System.out.printf("\nPreço ao consumidor: R$ %.2f",  preco_f2);
			} else {
				   System.out.printf("\nPreço ao consumidor: R$ %.2f", preco_f3);
					}
				}
		}
	
		
		
		
	