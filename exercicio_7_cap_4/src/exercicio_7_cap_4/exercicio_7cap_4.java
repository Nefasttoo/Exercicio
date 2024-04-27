package exercicio_7_cap_4;
	import java.util.Scanner;
	  public class exercicio_7cap_4 {
		public static void main(String[]args) {
		{
			
			Scanner entrada = new Scanner(System.in);
			double bonus = 0.30, salario, sal_reaj, sal_inf = 500;
			
			System.out.println("Digite o salario do funcionario: \n");
			salario = entrada.nextDouble();
			
			//System.out.println("Salario reajustado com bonus:");
			sal_reaj = salario * (1 + bonus);
			
			//System.out.printf("\nSalario + bonus: R$" + sal_reaj);
			
			if (salario >= sal_inf) {
	            System.out.println("O funcionario nao tem direito ao aumento.");
	        }  else {
	            System.out.printf("\nSalario + bonus: R$%.2f%n", sal_reaj);
	        }
			
			entrada.close();
		}
	  }
	}