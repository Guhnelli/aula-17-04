package aula17_04;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double numero, soma=0,media ;


		for (int i = 1 ; i <= 5 ; i++) {
			System.out.println("Informe a nota : " + i);
			numero = ler.nextInt();
			soma = soma +numero;
			
		}
		
		media= (soma/5);
		System.out.println("a media é: " +media);

	}

} 

