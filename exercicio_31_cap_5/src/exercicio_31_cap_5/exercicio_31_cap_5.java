package exercicio_31_cap_5;

import java.util.Scanner;

public class exercicio_31_cap_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nht, valor, salMin = 450, salIni, auxilio, salFin;
        int codigo;
        String turno, categoria;
        
        //NHT NUMERO HORAS TRABALHADAS
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o código: ");
            codigo = entrada.nextInt();

            System.out.print("Número de horas trabalhadas: ");
            nht = entrada.nextDouble();

            System.out.print("Turno (M/V/N): ");
            turno = entrada.next();

            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
                System.out.print("Turno inválido. Digite novamente (M/V/N): ");
                turno = entrada.next();
            }

            System.out.print("Categoria (G/O): ");
            categoria = entrada.next();

            while (!categoria.equals("G") && !categoria.equals("O")) {
                System.out.print("Categoria inválida. Digite novamente (G/O): ");
                categoria = entrada.next();
            }

            if (categoria.equals("G")) {
                valor = turno.equals("N") ? salMin * 18 / 100 : salMin * 15 / 100;
            } else {
                valor = turno.equals("N") ? salMin * 13 / 100 : salMin * 10 / 100;
            }

            salIni = nht * valor;

            if (salIni <= 300) {
                auxilio = salIni * 20 / 100;
            } else if (salIni < 600) {
                auxilio = salIni * 15 / 100;
            } else {
                auxilio = 0;
            }

            salFin = salIni + auxilio;

            System.out.println("Salário Inicial: " + salIni);
            System.out.println("Auxílio: " + auxilio);
            System.out.println("Salário Final: " + salFin);
        }

        entrada.close();
    }
}
