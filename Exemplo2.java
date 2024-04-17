package aula17_04;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n;

		System.out.print ("Digite um numero maior que zero: ");
		n= ler.nextInt ();

		for(int i=0; i<= n ; i++) {
			System.out.println("numero "+i);
			ler.close();
		}
	}

}
