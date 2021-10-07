/*4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.*/
 

package br.generation.vetores;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[][]matriz = new int[3][3];
		int somaG = 0;
		int somaD = 0;
				
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Digite os números da posição [%d,%d]: ", l, c);
				matriz[l][c] = ler.nextInt();
			}
			System.out.println();			
		}
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				somaG += matriz[l][c];
				
				if(l == c) {
					somaD += matriz[l][c];
				}				
			}
		}
		System.out.println("O resultado da soma da diagonal principal é:" + somaD);
		System.out.println("O resultado da soma total é:" + somaG);
	}

}
