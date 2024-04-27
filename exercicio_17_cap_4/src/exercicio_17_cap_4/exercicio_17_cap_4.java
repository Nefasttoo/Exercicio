package exercicio_17_cap_4;

	import java.util.Scanner;
	public class exercicio_17_cap_4 {
		public static void main (String[]args) {
			
			Scanner entrada = new Scanner (System.in);
			int senhaCorreta = 4531;
			
			System.out.println("Ensira a senha");
			int senhaDigitada = entrada.nextInt();
			
			if (senhaDigitada == senhaCorreta) {
				System.out.printf("Acesso permitido");
			} else {
				System.out.printf("Acesso, negado");
			}
			entrada.close();
		}
	}