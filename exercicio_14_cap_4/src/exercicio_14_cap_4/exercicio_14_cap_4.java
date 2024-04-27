package exercicio_14_cap_4;

	import java.util.Scanner;

	public class exercicio_14_cap_4 {
			public static void main (String[]args) {
			
				Scanner entrada = new Scanner (System.in);
				double salarioAtual, salarioNovo;
				double aum1 = 0.50, aum2 = 0.40, aum3 = 0.30, aum4 = 0.20, aum5 = 0.10, aum6 = 0.05;
								
				System.out.println("Insira o Salario do funcionario: R$");
				salarioAtual = entrada.nextDouble();
				
				salarioNovo = salarioAtual * (1 + aum1);
				salarioNovo = salarioAtual * (1 + aum2);
				salarioNovo = salarioAtual * (1 + aum3);
				salarioNovo = salarioAtual * (1 + aum4);
				salarioNovo = salarioAtual * (1 + aum5);
				salarioNovo = salarioAtual * (1 + aum6);
				
				if (salarioAtual < 0) {
					System.out.println("Salario nao pode ser 0 ou negativo");
					System.exit(0);
					
				} else if (salarioNovo <=300) {
					salarioNovo = salarioAtual * (1 + aum1);
				} else if (salarioNovo <=500) {
					salarioNovo = salarioAtual * (1 + aum2);
				} else if (salarioNovo <=700) {
					salarioNovo = salarioAtual * (1 + aum3);
				} else if (salarioNovo <=800) {
					salarioNovo = salarioAtual * (1 + aum4);
				} else if (salarioNovo <=1000) {
					salarioNovo = salarioAtual * (1 + aum5);
				} else {
					salarioNovo = salarioAtual * (1 + aum6);
				}	
				System.out.printf("Novo salário: R$%.2f\n", salarioNovo);
				
				}
			}			
		