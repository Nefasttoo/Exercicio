package exercicio_3_cap_4;
import java.util.Scanner;
	public class exercicio_3_cap_4 {
		public static void main(String[]args) {
		{
			
			Scanner entrada = new Scanner(System.in);
			int num1, num2;
			double menorNumero;
			
			System.out.println("Digite um numero inteiro: ");
			num1 = entrada.nextInt();
			
			System.out.println("Digite um outro inteiro: ");
			num2 = entrada.nextInt();
			
			//estrutura de condicinal de if-else de outra forma mais simples
			/*
			 
			 double menorNumero;
			 
				if (numero1 < numero2) {
    				menorNumero = numero1;
			  } else {
			   		menorNumero = numero2;
			}
			*/
	        menorNumero = (num1 < num2) ? num1 : num2;

	        System.out.println("O menor número é: " + menorNumero);
	        
			entrada.close();
		}
		}
	}