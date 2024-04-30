package exercicio_33_cap_5;

	import java.util.Scanner;
		public class exercicio_33_cap_5 {
			
			public static void main(String[] args) {
				
				Scanner entrada = new Scanner (System.in);
				
				int i = 1, num1 = 2, num2 = 7, num3 = 3, nTermos;
				
				
				System.out.println("\n-------------------------------------------------\n");
				
				System.out.println("Insira um numero positivo");
				
				nTermos = entrada.nextInt();
				
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
				
				while (i != nTermos) {
					num1 = num2 * 2;
					System.out.println(num1);
					i = i +1;
						if (i != nTermos) {
							num2 = num2 * 3;
							System.out.println(num2);
							i = i + 1;
								if (i != nTermos) {
									num3 = num3 * 4;
									System.out.println(num3);
									i = i + 1;
									
								}
						}
				}
										
				entrada.close();
			}
		}