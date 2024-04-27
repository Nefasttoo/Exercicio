package exercicio_11;

	import java.util.Scanner;
	
	 public class exercicio_11 {
		public static void main(String[]args) {
		{
		Scanner entrada = new Scanner(System.in);
		double x, quad, cubo, r2, r3;
		
		System.out.println("\nDigite um numero: ");
		
		x =  new Scanner(System.in).nextInt(); //verificar estas linhas do porque o Scanner mesmo declarado em cima.
		quad =  new Scanner(System.in).nextInt();
		cubo =  new Scanner(System.in).nextInt();
		r2 =  new Scanner(System.in).nextInt();
		r3 =  new Scanner(System.in).nextInt();
		
		
		System.out.println("\nDigite um numero ao quadrado: ");
		quad = Math.pow(x, 2);
		System.out.println("\nDigite um numero ao cubo: ");
		cubo = Math.pow(x, 3);
		System.out.println("\nDigite uma raiz quadrada: ");
		r2 = Math.sqrt(x);
		System.out.println("\nDigite uma raiz cubica: ");
		r3 = Math.cbrt(x);
		
		System.out.printf("\nquad: , cubo: , r2: , r3: " + quad, cubo, r2, r3);
				
		entrada.close();
		}
	   }
	 }