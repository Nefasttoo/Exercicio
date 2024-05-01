package exercicio_40;

import java.util.Scanner;
	
	public class exercicio_40 {
	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			double salario, c1, c2, m = 0.02, restou;
			
			System.out.println("\n******************************************\n");
			
			
			System.out.print("Insira o salario de Joao: R$ ");
			salario = entrada.nextDouble();
			
			
			System.out.print("Insira valor da conta A: R$ ");
			c1 = entrada.nextDouble();
			c1 = c1 + (c1 * m);
			System.out.println("Conta 1 com multa: " + c1);
			
			
			System.out.print("\nInsira valor da conta B: R$ ");
			c2 = entrada.nextDouble();
			c2 = c2 + (c2 * m);
			System.out.print("Conta 2 com multa: " + c2 + "\n");
			
			
			restou = salario - c1 - c2;
			
			System.out.println("\n******************************************\n");
			
			System.out.printf("Salario corrigido:R$ %.2f", + restou);
			
			entrada.close();
			
		}
}