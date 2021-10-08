package br.generation.classes;

public class Cliente {
	private String nome;
	private int idade;
	private int cpf;
	
	void cadastrar() {
		System.out.println("Cliente está fazendo o cadastro");
	}
	void comprar() {
		System.out.println("Cliente está fazendo compras");
	}
	void pagar() {
		System.out.println("Cliente está realizando pagamento");
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
	public void setIdade(int nome) {
		this.idade = idade;
	}	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
			

}
