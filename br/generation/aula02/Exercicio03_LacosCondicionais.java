package br.generation.aula02;

import java.util.Scanner;

public class Exercicio03_LacosCondicionais {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade=0;
		
		 System.out.println("Digite sua idade: ");
		 idade = ler.nextInt();
		 
		 if(idade >= 10 && idade < 14){
			 System.out.println("Você está na categoria infantil ");
		 
		 }else if(idade >= 15 && idade < 17){
			 System.out.println("Você está na categoria juvenil ");
		 
		 }else if(idade >= 18 && idade < 25){
			 System.out.println("Você está na categoria adulto ");
		 
		 }else {
			 System.out.println("Você não está em nenhuma categoria!");
		 }

	}

}
