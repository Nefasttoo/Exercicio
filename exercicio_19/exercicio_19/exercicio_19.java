package exercicio_19;
import java.util.Scanner;
	public class exercicio_19 {
		public static void main(String[]args) {
			{
				Scanner entrada = new Scanner(System.in);
				double h_degrau, h_usuario, degrau; // h_degrau = altura do degrau e h_usuario = altura que usuario deseja subir
				
				System.out.printf("\nForneça altura do degrau (m): ");
				h_degrau = entrada.nextDouble();
				
				System.out.printf("\nAltura que o usuario deseja subir (m): ");
				h_usuario = entrada.nextDouble();
				
				degrau = h_usuario / h_degrau;
				
				System.out.print("\nDegrau a subir: " + degrau);
				
				entrada.close();
			}
			
		}
	}