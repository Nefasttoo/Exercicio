package exercicio_1_cap_4;

	import java.util.Scanner;
		public class exercicio_1_cap_4 {
			public static void main(String[]args) {
			 {
				 
			Scanner entrada = new Scanner(System.in);
			double n1, n2, n3, n4, media_nt;
			boolean aprovado, reprovado;
			
			System.out.print("Digite 1° Nota: ");
			n1 = entrada.nextDouble();
			
			System.out.print("Digite 2° Nota: ");
			n2 = entrada.nextDouble();
			
			System.out.print("Digite 3° Nota: ");
			n3 = entrada.nextDouble();
			
			System.out.print("Digite 4° Nota: ");
			n4 = entrada.nextDouble();
			
			
			media_nt = (n1 + n2 + n3 + n4) / 4;	
			System.out.println("Media da nota: " + media_nt);
			
			aprovado = media_nt >= 7;
			
			if (aprovado) {
				System.out.println("Aprovado!");
			} else {
				System.out.println("Reprovado");
						
			entrada.close();
			}
			}
		}
		}