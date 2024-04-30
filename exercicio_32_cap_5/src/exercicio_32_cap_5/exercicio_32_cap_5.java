package exercicio_32_cap_5;

	import java.util.Scanner;
		public class exercicio_32_cap_5 {
			public static void main(String[] args) {
				
				
				Scanner entrada = new Scanner (System.in);
				
				int cantador, num1 = 0, num2 = 1, reset;
				
				System.out.println("\n-------------------------------------------------------\n");
				
				System.out.println("Digite numero 1º: ");
				num1 = entrada.nextInt();
				
				System.out.println("Digite numero 2º: ");
				num2 = entrada.nextInt();
				
				for (int contador = 0; contador < 3; contador++) {
					reset = num1 + num2;
					System.out.println(reset);
					num1 = num2;
					num2 = reset;
				}
				entrada.close();
			}
		}