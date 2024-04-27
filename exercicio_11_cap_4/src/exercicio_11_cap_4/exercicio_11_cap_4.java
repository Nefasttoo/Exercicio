package exercicio_11_cap_4;

import java.util.Scanner;
	public class exercicio_11_cap_4 {
		public static void main (String[]args) {
			
			Scanner entrada = new Scanner (System.in);
			double salario_atual, salario_novo1, salario_novo2, salario_novo3, salario_novo4;
			double aum1 = 0.15, aum2 = 0.10, aum3 = 0.05, aum4 = 0;
			
			System.out.printf("\nDigite o salario funcionario: \n");
			salario_atual = entrada.nextDouble();
			
			System.out.println("Até R$300,00 = 15%");
			System.out.println("R$300,00 a R$600,00 = 10%");
			System.out.println("R$600,00 a R$900,00 = 5%");
			System.out.println("Acima de R$900,00 = 0\n");
			
			salario_novo1 = salario_atual + (salario_atual * aum1);
			salario_novo2 = salario_atual + (salario_atual * aum2);
			salario_novo3 = salario_atual + (salario_atual * aum3);
			salario_novo4 = salario_atual + (salario_atual * aum4);
			
			if (salario_atual < 0) {
				System.out.println("Valor do salario nao pode ser 0 ou negativo");
				System.exit(0);
			} else if (salario_atual <= 300) {
				System.out.printf("Percentual de aumento 15%%: R$%.2f\n", salario_novo1);
			} else if (salario_atual <= 600) {
				System.out.printf("Percentual de aumento 10%%: R$%.2f\n", salario_novo2);
			} else if (salario_atual <= 900) {
				System.out.printf("Percentual de aumento 5%%: R$%.2f\n", salario_novo3);
			} else {
				System.out.printf("Sem aumento 0: R$%.2f\n", salario_novo4);
			}
			
			entrada.close();
		}
	}
	