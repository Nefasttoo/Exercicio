package exercicio_38;

	import java.util.Scanner;
		public class exercicio_38 {
			public static void main(String[] args) {
				
				Scanner entrada = new Scanner (System.in);
							
				System.out.println("\n****************************************************\n");
				
				System.out.println("TABUADA");
				
				System.out.print("Digite um número para calcular a tabuada: ");
				      int numero = entrada.nextInt();

				System.out.println("Tabuada de " + numero + ":");

				      for (int i = 1; i <= 10; i++) {
				          int resultado = numero * i;
				          
				System.out.println(numero + " x " + i + " = " + resultado);
				
				        }
				    }
			
		}