package exercicio_6_cap_4;

import java.util.Scanner;

public class exercicio_6_cap_4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double num1, num2;
        
        System.out.print("Digite o primeiro numero: ");
        num1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        num2 = entrada.nextDouble();

        System.out.println("Escolha a operacao:");
        System.out.println("1. Elevar o primeiro numero ao segundo numero");
        System.out.println("2. Elevar o segundo numero ao primeiro numero");
        System.out.println("3. Calcular a raiz quadrada do primeiro numero");
        System.out.println("4. Calcular a raiz quadrada do segundo numero");
        System.out.println("5. Calcular a raiz cubica do primeiro numero");
        System.out.println("6. Calcular a raiz cubica do segundo numero");
        System.out.print("Opcao: ");
        
        int opcao = entrada.nextInt();
        double resultado = 0;

        switch(opcao) {
            case 1:
                resultado = Math.pow(num1, num2);
                break;
            case 2:
                resultado = Math.pow(num2, num1);
                break;
            case 3:
                resultado = Math.sqrt(num1);
                break;
            case 4:
                resultado = Math.sqrt(num2);
                break;
            case 5:
                resultado = Math.cbrt(num1);
                break;
            case 6:
                resultado = Math.cbrt(num2);
                break;
            default:
                System.out.println("Opcao invalida. O programa sera encerrado.");
                System.exit(0);
        }

        System.out.printf("Resultado: %.2f%n", resultado);

        entrada.close();
    }
}
