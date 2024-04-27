package exercicio_4_cap_4;
import java.util.Scanner;
	public class exercicio_4_cap_4 {
		private static int maiorNum;

		public static void main(String[]args) {
		{
		
			Scanner entrada = new Scanner (System.in);
			int num1, num2, num3;
			
			System.out.print("Digite um numero inteiro: ");
			num1 = entrada.nextInt();
			
			System.out.print("Digite segundo numero inteiro: ");
			num2 = entrada.nextInt();
			
			System.out.print("Digite terceiro numero inteiro: ");
			num3 = entrada.nextInt();
			
			//  if (num1 >= num2 && num1 >= num3) {
            //  maiorNum = num1;
			//  } else if (num2 >= num1 && num2 >= num3) {
            //  maiorNum = num2;
			//  } else {
            //  maiorNum = num3;
		    //  }
			
			setMaiorNum((num1 >= num2 && num1 >= num3) ? num1 : ((num2 >= num1 && num2 >= num3) ? num2 : num3));
			
			System.out.print("O maior numero é: " + maiorNum);
		
			entrada.close();
		
		}
	}

		public static int getMaiorNum() {
			return maiorNum;
		}

		public static void setMaiorNum(int maiorNum) {
			exercicio_4_cap_4.maiorNum = maiorNum;
		}
	}