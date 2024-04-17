package aula17_04;

import java.util.Scanner;

public class Exemplo4 {
	

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, result;
		
		System.out.print ("Digite um numero para tabuada: ");
		n= ler.nextInt ();

		for (int i = 0 ; i <= 10 ; i++) {
			result = n*i;
			System.out.println(n + "x" + i + " - " + result);
			
		}
ler.close();
}
}
