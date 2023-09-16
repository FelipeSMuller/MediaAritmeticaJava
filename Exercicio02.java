package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Média de Números: Peça ao usuário para digitar uma série de números separados
		 * por espaços e, em seguida, calcule e exiba a média deles.
		 */

		int[] numeros = new int[5];
		int armazena, soma = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite 5 numeros ");

			armazena = sc.nextInt();
			numeros[i] = armazena;
			soma += numeros[i];
		}

		System.out.println("Numeros armazenados no Array :");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		System.out.println("Media final dos numeros : " + soma / numeros.length);

		sc.close();

	}

}
