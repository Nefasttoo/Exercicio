package exercicio_29_cap_5;

		import java.util.Scanner;

		public class exercicio_29_cap_5 {
		    public static void main(String[] args) {
		    	
		    	
		        Scanner entrada = new Scanner(System.in);
		        System.out.print("\n----------------------------------------------------\n");

		        int codigoCidade, numVeiculo, numAcidVita;
		        int maior = 0, cidadeMaior = 0, menor = Integer.MAX_VALUE, cidadeMenor = 0;
		        int somaVeiculo = 0, somaAcid = 0, contadorAcid = 0;
		        int mediaVeiculo, mediaAcid = 0;

		        for (int i = 1; i <= 5; i++) {
		            System.out.println("codigoCidade: ");
		            codigoCidade = entrada.nextInt();

		            System.out.println("numVeiculo: ");
		            numVeiculo = entrada.nextInt();

		            System.out.println("numAcid: ");
		            numAcidVita = entrada.nextInt();

		            if (i == 1) {
		                maior = numAcidVita;
		                cidadeMaior = codigoCidade;
		                menor = numAcidVita;
		                cidadeMenor = codigoCidade;
		            } else {
		                if (numAcidVita > maior) {
		                    maior = numAcidVita;
		                    cidadeMaior = codigoCidade;   
		                }
		                if (numAcidVita < menor) {
		                    menor = numAcidVita;
		                    cidadeMenor = codigoCidade;
		                }
		            }

		            somaVeiculo += numVeiculo;

		            if (numVeiculo < 2000) {
		                somaAcid += numAcidVita;
		                contadorAcid++;
		            }
		        }

		        System.out.printf("\nCidade com maior número de acidentes: %d (%d acidentes)\n", cidadeMaior, maior);
		        System.out.printf("Cidade com menor número de acidentes: %d (%d acidentes)\n", cidadeMenor, menor);

		        mediaVeiculo = somaVeiculo / 5;
		        System.out.printf("Média de veículos: %d\n", mediaVeiculo);

		        if (contadorAcid > 0) {
		            mediaAcid = somaAcid / contadorAcid;
		            System.out.printf("Média de acidentes em cidades com menos de 2000 veículos: %d\n", mediaAcid);
		        } else {
		            System.out.println("Nenhuma cidade foi digitada com menos de 2000 veículos.");
		        }

		        entrada.close();
		    }
		}

	
		
		
	