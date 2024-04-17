package aula17_04;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String nome;

		for (int i = 1 ; i <= 6 ; i++) {
			System.out.println("Informe seu nome: ");
			nome = ler.next();
			System.out.println("seu nome é : "+nome);
			
		}
ler.close();
	}
} 

