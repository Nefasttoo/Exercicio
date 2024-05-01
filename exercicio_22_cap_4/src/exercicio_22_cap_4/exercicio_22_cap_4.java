package exercicio_22_cap_4;

	import java.util.Scanner;
		public class exercicio_22_cap_4 {
		
			public static void main(String[] args) {
				
				
				Scanner entrada = new Scanner (System.in);
				
				//int idade;
				double peso = 0, idade = 0;
				
				System.out.println("\n**************************************************\n");
				
				System.out.println("Forneca peso e idade");
				System.out.print("PESO: ");
				peso = entrada.nextDouble();
				System.out.print("IDADE: ");
				idade = entrada.nextDouble();
				
								
				if (idade < 20) {
		            if (peso < 60) {
		                System.out.println("Risco 9");
		            } else if (peso <= 90) {
		                System.out.println("Risco 8");
		            } else {
		                System.out.println("Risco 7");
		            }
		        } else if (idade <= 50) {
		            if (peso < 60) {
		                System.out.println("Risco 6");
		            } else if (peso <= 90) {
		                System.out.println("Risco 5");
		            } else {
		                System.out.println("Risco 4");
		            }
		        } else {
		            if (peso < 60) {
		                System.out.println("Risco 3");
		            } else if (peso <= 90) {
		                System.out.println("Risco 2");
		            } else {
		                System.out.println("Risco 1");
		            }
		        }
				
				entrada.close();
				
					}
						
			}		
