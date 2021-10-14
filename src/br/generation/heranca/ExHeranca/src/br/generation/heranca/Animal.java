package br.generation.heranca;

public class Animal {
	private String nome;
	private int idade;
	
	
	void emitirsom () {
		System.out.println("Emite som");
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
