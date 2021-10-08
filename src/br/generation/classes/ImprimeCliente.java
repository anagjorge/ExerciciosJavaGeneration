package br.generation.classes;

public class ImprimeCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Maria");
		cliente1.setIdade(25);
		cliente1.setCpf(34568265646);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getIdade());
		System.out.println(cliente1.getCpf());
		
		cliente1.cadastrar();
		cliente1.comprar();
		cliente1.pagar();
	}

}
