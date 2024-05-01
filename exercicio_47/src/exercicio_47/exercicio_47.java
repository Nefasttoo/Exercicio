package exercicio_47;

	import java.util.Scanner;
		public class exercicio_47 {
			public static void main(String[] args) {
				
				Scanner entrada = new Scanner (System.in);
				double  nLados, nDiagonais;
				
				
				System.out.print("Insira numero de lados: ");
				nLados = entrada.nextDouble();
				
				nDiagonais = nLados * (nLados - 3) / 2;
				
				System.out.printf("numero de diagonais é: %.0f", + nDiagonais);
				
				entrada.close();
			}
		}
		

/* Faça um programa que receba o número de lados de um polígono convexo, calcule e mostre o número
de diagonais desse polígono. Sabe-se que ND=N * (N−3)/2, em que N é o número de lados dopolígono */