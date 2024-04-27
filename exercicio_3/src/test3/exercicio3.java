package test3;

import java.util.Scanner;
	
public class exercicio3 {
	public static void main (String[] args) {
	int n1, n2, n3, p1, p2, p3, media;
	System.out.println("Digite tres notas: \n");
	
	n1 = new Scanner(System.in).nextInt();
	n2 = new Scanner(System.in).nextInt();
	n3 = new Scanner(System.in).nextInt();
	p1 = new Scanner(System.in).nextInt();
	p2 = new Scanner(System.in).nextInt();
	p3 = new Scanner(System.in).nextInt();
	
	media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
	System.out.println("media: " + media);
	
	
		}
}