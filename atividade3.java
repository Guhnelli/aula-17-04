package aula17_04;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double numero, soma=0;


		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println("Informe  : " + i);
			numero = ler.nextInt();
			soma = soma +numero;
				if (soma+i%2!=0) {
					System.out.println( i + "  -  numeros impares    " );
				}
				else {
					System.out.println( i + "  -  numeros pares    " );
				}
				ler.close();
			}
		}
	}


		
	