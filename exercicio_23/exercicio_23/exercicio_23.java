package exercicio_23;

import java.util.Scanner;
	public class exercicio_23 {	
		public static void main(String[]args) {
	
		Scanner entrada = new Scanner(System.in);
		int i, a;
		double num, f;
		
		System.out.print("Digite um numero real: ");
		num = entrada.nextDouble();
		
		i = (int) num;
		
		f = num - i;
	
		a = arredondado(num);
		
        System.out.printf("\nInteiro: %d\n", i);
        System.out.printf("Fracionário: %.2f\n", f);
        System.out.printf("Arredondado: %d\n", a);
        
        entrada.close();
    }

    private static int arredondado(double num) {
        return (int) Math.round(num);
    }
}