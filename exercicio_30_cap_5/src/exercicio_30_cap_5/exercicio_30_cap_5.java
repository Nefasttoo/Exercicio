package exercicio_30_cap_5;
		
		import java.util.Scanner;

		public class exercicio_30_cap_5 {
		    public static void main(String[] args) {
		        Scanner entrada = new Scanner(System.in);

		        double s = 0;
		        double x, numTermos;

		        System.out.printf("Número de termos: ");
		        numTermos = entrada.nextDouble();
		        System.out.printf("x: ");
		        x = entrada.nextDouble();

		        double denominador = 1;

		        for (int i = 1; i <= numTermos; i++) {
		            double fatorial = 1;
		            for (int j = 1; j <= denominador; j++) {
		                fatorial *= j;
		            }
		            double termo = Math.pow(x, denominador) / fatorial;
		            if (i % 2 == 0) {
		                s -= termo;
		            } else {
		                s += termo;
		            }
		            if (denominador != 4) {
		                denominador++;
		            }
		        }

		        System.out.printf("Resultado: %.4f\n", s);

		        entrada.close();
		    }
		


		private static double x(double d) {
			// TODO Auto-generated method stub
			return 0;
		}
	}