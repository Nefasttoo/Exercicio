
package exercicio_16;

import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nDigite o salario minimo: ");
        double vlr_slm = entrada.nextDouble();

        System.out.println("\nDigite valor da hora trabalhada: ");
        double vlr_hr = entrada.nextDouble();
        
        double hr_tb = vlr_slm / 8; // a hora trabalhada vale a metade do salario minimo
        System.out.println("\nHora trabalhada: " + hr_tb);

        double sl_br = hr_tb * vlr_hr; // Calculando o salário bruto
        System.out.printf("\nSalario bruto: %.2f", sl_br);

        double imp = 0.03 * sl_br; // impostos equivalem a 3% do salario bruto
        System.out.printf("\nImpostos: %.2f", imp);

        double sl_rc = sl_br - imp; // salario a receber equivale ao salario bruto menos o imposto
        System.out.printf("\nSalario a receber: %.2f", sl_rc);

        entrada.close();
    }
}
