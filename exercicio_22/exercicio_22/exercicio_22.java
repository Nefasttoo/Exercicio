package exercicio_22;

import java.util.Scanner;
	public class exercicio_22{
		public static void main(String[]args) {
		
		{
			var entrada = new Scanner(System.in);
			double kw_hr, slr_min, qdt_kwh, vlr_reais, desc, vlr_desc;
			
			System.out.print("Digite o salario minimo: ");
			slr_min = entrada.nextDouble();
			
			System.out.print("Digite o quantidade de quilowatts hora: ");
			qdt_kwh = entrada.nextDouble();
			
			kw_hr = slr_min / 5; // quilowatts horas é 1/5 do salario minimo
			vlr_reais = kw_hr * qdt_kwh; // valor em rais do quilowatts horas
			desc = vlr_reais * 15 / 100; // desconto de 15%
			vlr_desc = vlr_reais - desc;
			
			System.out.printf("\nvalor do quilowatts hora: R$ %.2f ",  kw_hr);
			System.out.printf("\nvalor em reais é: R$ %.2f",  vlr_reais);
			System.out.printf("\nvalor do desconto é: R$ %.2f",  vlr_desc);
			
			entrada.close();
		}
		}
	}