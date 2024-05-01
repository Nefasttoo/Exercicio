package exercicio_46;

	import java.util.Scanner;

	public class exercicio_46 {

	    public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);
	        
	        long horasTrabalhadas, horasExtras;
	        double salarioMinimo, valorHora, valorHoraExtra, salarioReceber, salarioBruto, quantiaHoraExtra;

	        System.out.print("Número de horas trabalhadas: ");
	        horasTrabalhadas = entrada.nextLong();

	        System.out.print("Salário mínimo: ");
	        salarioMinimo = entrada.nextDouble();

	        System.out.print("Número de horas extras trabalhadas: ");
	        horasExtras = entrada.nextLong();

	        valorHora = salarioMinimo / 1.0 / 8;

	        valorHoraExtra = salarioMinimo / 1.0 / 4;

	        salarioBruto = horasTrabalhadas * valorHora;

	        quantiaHoraExtra = horasExtras * valorHoraExtra;

	        salarioReceber = salarioBruto + quantiaHoraExtra;

	        System.out.println("Salário a receber: " + salarioReceber);

	        entrada.close();
	    }
	}
/*
 Faça um programa que receba o número de horas trabalhadas, o valor do salário mínimo e o número
de horas extras trabalhadas, calcule e mostre o salário a receber, de acordo com as regras a seguir:
a)a hora trabalhada vale 1/8 do salário mínimo;
b)a hora extra vale 1/4 do salário mínimo
c)o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
d)a quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas multiplicado pelo valor
da hora extra;
e)o salário a receber equivale ao salário bruto mais a quantia a receber pela hora extra */