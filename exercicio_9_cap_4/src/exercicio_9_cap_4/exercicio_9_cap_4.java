package exercicio_9_cap_4;

import java.util.Scanner;
	public class exercicio_9_cap_4 {
		public static void main(String[]args) {
		
		Scanner entrada = new Scanner (System.in);
		 double saldoMedio;
	        double valorC;
	        final double FAIXA_A = 0.10;
	        final double FAIXA_B = 0.20;
	        final double FAIXA_C = 0.25;
	        final double FAIXA_D = 0.30;
		
	        System.out.println("Digite o saldo médio: ");
	        saldoMedio = entrada.nextDouble();
	        
		System.out.print("\na. Até R$200,00 ");
		System.out.print("\nb. R$300,00 a R$200,00 ");
		System.out.print("\nc. R$400,00 a R$300,00 ");
		System.out.print("\nd. Acima de R$400,00 \n");
		
		System.out.println("\nDigite o valor do crédito: ");
        valorC = entrada.nextDouble();
        double resultado = 0;

        if (valorC < 0) {
            System.out.println("O valor do crédito não pode ser negativo. O programa será encerrado.");
            System.exit(0);
        }
		
        if (valorC <= 200) {
            resultado = valorC * FAIXA_A;
        } else if (valorC <= 300) {
            resultado = valorC * FAIXA_B;
        } else if (valorC <= 400) {
            resultado = valorC * FAIXA_C;
        } else {
            resultado = valorC * FAIXA_D;
        }

        System.out.println("Resultado: " + resultado);
        System.out.println("SALDO TOTAL: " + (saldoMedio + resultado));
        
        entrada.close();
    }
}
	
	