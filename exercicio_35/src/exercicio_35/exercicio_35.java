package exercicio_35;

	import java.util.Scanner;
		
		public class exercicio_35 {
			
			public static void main(String[] args) {
				
				Scanner entrada = new Scanner (System.in);
				
				// A = ladao * lado
				
				long area, ladoA, ladoB;
				
				System.out.print("\n***************************************************\n");
				
				System.out.print("Digite um dos lado do quadrado: ");
				ladoA = entrada.nextLong();
				
				System.out.print("Digite o outro lado do quadrado: ");
				ladoB = entrada.nextLong();
				
				area = ladoA * ladoB;
				
				System.out.println("A area do quadrado é: " + area);
				
				entrada.close();
			}
		}