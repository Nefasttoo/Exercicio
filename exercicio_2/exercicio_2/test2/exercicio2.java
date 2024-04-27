package test2;

import java.util.Scanner;


 public class exercicio2 {
    public static void main(String[] args) {
    
    	long n1, n2, n3, soma, divisao;
		System.out.println("\nDigite primeira nota: ");
    	n1 =  new Scanner(System.in).nextInt();
    	
    	System.out.println("\nDigite segunda nota: ");
    	n2 =  new Scanner(System.in).nextInt();
    	
    	System.out.println("\nDigite terceira nota: ");
    	n3 =  new Scanner(System.in).nextInt();
    	
    	
    	soma = n1 + n2 + n3;
    	System.out.println("soma: " + soma);
    	
    	divisao = (n1 + n2 + n3) / 3;
    	System.out.println("divisao: " + divisao);
    	
		System.out.println("media da nota: " + divisao);
		
    	
    }
}