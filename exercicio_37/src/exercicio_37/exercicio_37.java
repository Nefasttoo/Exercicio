package exercicio_37;

	import java.util.Scanner;
		public class exercicio_37 {
			
			public static void main(String[] args) {
				
				Scanner entrada = new Scanner (System.in);
				
				long salariomin, salariofunc, qtdsalariomin;
				
				System.out.println("\n*****************************************************\n");
				
				System.out.print("Insira o salario minimo:R$ ");
				salariomin = entrada.nextLong();
				
				System.out.print("Insira o salario do funcionario:R$ ");
				salariofunc = entrada.nextLong();
				
				qtdsalariomin = salariofunc / salariomin;
				
				System.out.println("\nFuncionario ganha cerca de: " + qtdsalariomin + " salarios minimos");
				
				entrada.close();
				
			}
		}