/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/


package br.generation.vetores;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[]notas = new int[5];
		int maior = 0;
		
		 for(int i=0; i < notas.length; i++) {
	            System.out.println("Digite uma pontua��o: ");
	            notas[i] = ler.nextInt();

	            if(notas[i] > maior) {
	                maior = notas[i]; 
	            }
	        }
	        System.out.println("A maior pontua��o �: " + maior);	

	}

}
