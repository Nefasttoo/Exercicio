package exercicio_45;

	import java.util.Scanner;

	public class exercicio_45 {
	
		public static void main(String[] args) {
		
			var entrada = new Scanner (System.in);
			
			float ang, alt, escada, radianos = 0;
			
			System.out.print("\nDigite o angulo: ");
			ang = entrada.nextFloat();
			
			System.out.printf("\nDigite a altura: ");
			alt = entrada.nextFloat();
			
			radianos = (float) Math.toRadians(ang); // Convertendo graus para radianos
	        escada = alt / (float) Math.sin(radianos); // Calculando o comprimento da escada usando a função seno

			
			System.out.printf("\nMedida da escada: %.2f Mts", + escada);
			
			entrada.close();
			
		}
	}