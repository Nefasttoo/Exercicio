package exercicio_27_cap_5;
import java.util.Scanner;
	
		public class exercicio_27_cap_5 {
		    public static void main(String[] args) {
		        Scanner entrada = new Scanner(System.in);
		        int n;
		        
		        System.out.println("\n------------------------------------------------\n");
		        System.out.println("Digite um numero inteiro e positivo: ");
		        n = entrada.nextInt();

		        double e = 1;

		        for (int i = 1; i <= n; i++) {
		            int fatorial = 1;
		            
		            for (int j = 1; j <= i; j++) {
		                fatorial *= j; // Cálculo do fatorial corrigido
		            }
		            e += 1.0 / fatorial; // Garantir que a divisão seja feita como double
		        }

		        System.out.printf("e: %.4f\n", e);
		        entrada.close();
		    }
		}
