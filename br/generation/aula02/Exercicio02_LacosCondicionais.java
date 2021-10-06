package br.generation.aula02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02_LacosCondicionais {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 
		 int[] numero = new int[3];
		 int i;
		 
		 for(i=0; i<3; i++) {
	            System.out.println("Digite um número inteiro: ");
	            numero[i] = ler.nextInt();
		 }
		 Arrays.sort(numero);
		 
		 System.out.println("A ordem crescente dos números é: " + Arrays.toString(numero));
		 
	}

}
