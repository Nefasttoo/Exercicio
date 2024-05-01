package exercicio_49;

	import java.util.Scanner;

		public class exercicio_49 {
		    public static void main(String[] args) {
		        Scanner entrada = new Scanner(System.in);
		        
		        
		        double dinheiroEmReais, dinheiroEmDolares, dinheiroEmMarcoAlemao, dinheiroEmLibraEsterlina;
		        final double cotacaoDolar = 1.80;
		        final double cotacaoMarcoAlemao = 2.00;
		        final double cotacaoLibraEsterlina = 3.57;

		        System.out.print("Insira a quantidade de dinheiro em reais: ");
		        dinheiroEmReais = entrada.nextDouble();

		        dinheiroEmDolares = dinheiroEmReais / cotacaoDolar;
		        dinheiroEmMarcoAlemao = dinheiroEmReais / cotacaoMarcoAlemao;
		        dinheiroEmLibraEsterlina = dinheiroEmReais / cotacaoLibraEsterlina;

		        System.out.printf("\nQuantidade de dinheiro em dólares: $ %.2f", + dinheiroEmDolares);
		        System.out.printf("\nQuantidade de dinheiro em marco alemão: DM " + dinheiroEmMarcoAlemao);
		        System.out.printf("\nQuantidade de dinheiro em libra esterlina: £ %.2f", + dinheiroEmLibraEsterlina);

		        entrada.close();
		    }
		}
	
	/*Faça um programa que receba a quantidade de dinheiro em reais que uma pessoa que vai viajar possui. Ela vai passar por vários países e
	precisa converter seu dinheiro em dólares, marco alemão e libra esterlina.Sabe--se que a cotação do dólar é de R$ 1,80;
	do marco alemão, de R$ 2,00; e da libra esterlina, de R$ 3,57. Oprograma deve fazer as conversões e mostrá-las*/