package exercicio_12_cap_4;
	import java.util.Scanner;
		public class exercicio_12_cap_4 {
			public static void main (String[]args) {
				
				Scanner entrada = new Scanner (System.in);
				double sal_bru, bonus1 = 100, bonus2 = 75, bonus3 = 50, bonus4 = 25, imp = 0.07, novo_sal = 0;
				double novo1_sal, novo2_sal, novo3_sal, novo4_sal;
				
				//sal_bru = salario bruto; 
				
				System.out.println("Digite o salario bruto: ");
				sal_bru = entrada.nextDouble();
				
				System.out.println("Até R$350,00 gratificação R$100,00: ");
				System.out.println("R$350,00 a R$600,00 gratificação R$75,00: ");
				System.out.println("R$600,00 a R$900,00 gratificação R$50,00: ");
				System.out.println("Acima de R$900,00 gratificação R$35,00: \n");
				
				novo1_sal = (sal_bru + bonus1) * (1- imp);
				novo2_sal = (sal_bru + bonus2) * (1- imp);
				novo3_sal = (sal_bru + bonus3) * (1- imp);
				novo4_sal = (sal_bru + bonus4) * (1- imp);
				
				if (novo_sal < 0) {
					System.out.println("Salario nao pode ser menor que 0 ou negativo");
					System.exit(0);
					
				} else if (novo_sal <=350) {
				    System.out.printf("Novo salario: R$%.2f", novo1_sal);
				} else if (novo_sal <=600) {
					System.out.printf("Novo salario: R$%.2f", novo2_sal);
				} else if (novo_sal <=900) {
					System.out.printf("Novo salario: R$%.2f", novo3_sal);
				} else {
					System.out.printf("Novo salario: R$%.2f", novo4_sal);
				}
				
				entrada.close();
			}
		}