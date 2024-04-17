package aula17_04;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;

		System.out.print ("Digite um numero: ");
		numero= ler.nextInt ();

		for (int i = 0 ; i <= 10 ; i++) {
			if (i%2!=0) {
				System.out.println( i + "  -  numeros impares    " );
			}
			
			ler.close();
		}
	}
}

