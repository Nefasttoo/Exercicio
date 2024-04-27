package exercicio_15;

import java.util.Scanner;
	public class exercicio_15 {
		public static void main(String[]args) {
		{
			Scanner entrada = new Scanner(System.in);
			int p_fab, vlr_d, vlr_i, p_f; // p_fab = perço de fabrica; // percld = percentual de lucro do distribuidor; // 
															  // perc_i = percentual de imposto; // vlr_d = valor do distribuidor
														      // vlr_i = valor inicial; // p_f = preço final
			
			System.out.println("\nDigite o preço de fábrica: ");
	        int p_fab1 = entrada.nextInt();
	        
	        System.out.println("\nDigite o percetual do distribuidor: ");
	        int perc_ld1 = entrada.nextInt();
			
	        System.out.println("\nDigite o porcentual de imposto: ");
	        int perc_i1 = entrada.nextInt();
			
			
			vlr_d = p_fab1 * perc_ld1 / 100;
			vlr_i = p_fab1 * perc_i1 / 100;
			p_f = p_fab1 + vlr_d + vlr_i;
			
			System.out.println("\nvalor do distribuidor: " + vlr_d);
			System.out.println("\nvalor inicial: " + vlr_i);
			System.out.println("\nPreço final: R$" + p_f);
			
			entrada.close();
		}
	}
	}
