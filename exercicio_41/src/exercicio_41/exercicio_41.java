package exercicio_41;

	import java.util.Scanner;
		public class exercicio_41 {
			
			public static void main(String[] args) {
				
				
				Scanner entrada = new Scanner (System.in);
				
				double catetoA, catetoB, hipot, A;
				
				System.out.println("\n******************************************************\n");
				
				System.out.println("Digite um cateto: ");
				catetoA = entrada.nextDouble();
				
				System.out.println("Digite outro cateto: ");
				catetoB = entrada.nextDouble();
				
				System.out.println("Sua hipotenusa seria: ");
				hipot = Math.sqrt (catetoA * catetoA + catetoB * catetoB);
				
				System.out.printf("%.2f", + hipot);
				
				entrada.close();
			}
		}