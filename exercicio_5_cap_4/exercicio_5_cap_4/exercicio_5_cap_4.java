package exercicio_5_cap_4;

import java.util.Scanner;

public class exercicio_5_cap_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2; 
        double op_1, op_2, op_3, op_4;

        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextDouble();

        op_1 = (num1 + num2) / 2;
        op_2 = Math.abs(num1 - num2);
        op_3 = num1 * num2;
        op_4 = (num2 != 0) ? num1 / num2 : Double.POSITIVE_INFINITY;

        // Exibindo os resultados
        System.out.printf("\n1. Media entre os numeros digitados: %.2f\n", op_1);
        System.out.printf("2. Diferença do maior para o menor: %.2f\n", op_2);
        System.out.printf("3. Produto entre os numeros: %.2f\n", op_3);
        
        if (op_4 == Double.POSITIVE_INFINITY) {
            System.out.println("4. Divisao: impossivel dividir por zero.");
        } else {
            System.out.printf("4. Divisao do primeiro pelo segundo: %.2f\n", op_4);
        }

        entrada.close();
    }
}
