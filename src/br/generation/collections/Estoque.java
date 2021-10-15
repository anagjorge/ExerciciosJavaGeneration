package br.com.generation.collections;

public class Estoque {
	
	private int qtdSapatos;
	private String nome;	
	
	public Estoque(int qtdSapatos, String nome) {
		super();
		this.qtdSapatos = qtdSapatos;
		this.nome = nome;
	}

	public int getQtdSapatos() {
		return qtdSapatos;
	}
	public void setQtdSapatos(int qtdSapatos) {
		this.qtdSapatos = qtdSapatos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	

}
