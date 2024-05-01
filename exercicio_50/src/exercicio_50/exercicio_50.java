package exercicio_50;

	import java.util.Scanner;
	
		public class exercicio_50 {
			public static void main(String[] args) {
				
				Scanner entrada = new Scanner (System.in);
								
				double hora;
				
				System.out.print("HORAS => ");
				hora = entrada.nextDouble();
				
				double horaEmMinutos = hora * 60;
		        double minuto = 0;
				double totalMinutos = horaEmMinutos + minuto;
		        double totalSegundos = totalMinutos * 60;

		        System.out.println("Hora digitada em minutos: " + horaEmMinutos);
		        System.out.println("Total de minutos: " + totalMinutos);
		        System.out.println("Total de segundos: " + totalSegundos);

				
				
			}
		}
		
		
		
		/*Faça um programa que receba uma hora (uma variável para hora e outra para minutos), calcule emostre:
		a)a hora digitada convertida em minutos;
		b)o total dos minutos, ou seja, os minutos digitados mais a conversão anterior;
		c)o total dos minutos convertidos em segundos*/