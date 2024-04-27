package exercicio_8_cap_4;

	import java.util.Scanner;
		public class exercicio_8_cap_4 {
			public static void main(String[]args) {
			{
				
				Scanner entrada = new Scanner(System.in);
				double salario, reajuste1, reajuste2, bonus1 = 0.35, bonus2 = 0.15;
				
				System.out.printf("Salario do funcionario: ");
				salario = entrada.nextDouble();
				
				reajuste1 = salario * (1 + bonus1);
				reajuste2 = salario * (1 + bonus2);
			
				if (salario <= 300) {
					System.out.printf("Salario reajustado ate R$300,00 + 35%% bonus: R$%.2f%n", reajuste1);

				} else {
					System.out.printf("Salario reajustado acima R$300 + de 15%% bonus : R$%.2f%n", reajuste2);

				}
				
				entrada.close();	
			}
			}
		}