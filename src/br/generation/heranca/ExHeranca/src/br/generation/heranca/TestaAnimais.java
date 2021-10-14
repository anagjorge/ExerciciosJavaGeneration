package br.generation.heranca;

import java.util.Scanner;

public class TestaAnimais {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica laziness = new Preguica();
		
		dog.setNome("Wilson");
		dog.setIdade(2);
		
		horse.setNome("Chico");
		horse.setIdade(3);
		
		laziness.setNome("Rosinha");
		laziness.setIdade(5);
		
		System.out.println("Informações sobre cachorro:");
		System.out.println("Nome: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade() + "\n");
		System.out.println("Informações sobre cavalo:");
		System.out.println("Nome: " + horse.getNome());
		System.out.println("Idade: " + horse.getIdade() + "\n");
		
		System.out.println("Informações sobre preguiça:");
		System.out.println("Nome: " + laziness.getNome());
		System.out.println("Idade: " + laziness.getIdade() + "\n");

	}

}
