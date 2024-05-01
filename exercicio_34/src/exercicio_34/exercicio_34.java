package exercicio_34;

import java.util.Scanner;
	public class exercicio_34 {
		public static void main(String[] args) {
			
			
			Scanner entrada =  new Scanner (System.in);
			long A, BM, Bm, H;
			
			// A = ((basemaior + basemenor) * altura / 2)
			
			System.out.print("\n-------------------------------------------------------\n");
			
			System.out.println("Para calcular a area de um trapezio: insira os dados a seguir");
			
			System.out.println("Base maior: ");
			BM = entrada.nextLong();
			
			System.out.println("Base menor: ");
			Bm = entrada.nextLong();
			
			System.out.println("Altura: ");
			H = entrada.nextLong();
			
			A = ((BM + Bm) * H / 2);
			
			System.out.print("\nA area do trapezio é: " + A);
			
			entrada.close();
			
		}
	}