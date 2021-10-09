package br.generation.heranca;

public class Animal {

	public static void main(String[] args) {
		Cachorro cac = new Cachorro();
	    Cavalo cav = new Cavalo();
	    Preguica preg = new Preguica();

	    cac.setNome("Bidu");
	    cac.setIdade(3);
	    cac.setSom("Latir" );
	    cac.setCorre("correr");

	    cav.setNome("Castanha");
	    cav.setIdade(10);
	    cav.setSom("Relinchar");
	    cav.setCorre2("Sim !!!!");

	    preg.setNome("Thais");
	    preg.setIdade(20);
	    preg.setSom("sons de alta-frequência pelas narina");
	    preg.setSobe("Sobir em arvores!");

	    System.out.println("Nome do doguinho: " + cac.getNome());
	    System.out.println("Idade do doguinho: " + cac.getIdade());
	    System.out.println("Qual som ele emite? " + cac.getSom());
	    System.out.println("O que ele gosta de fazer?  " + cac.getCorre());


	    System.out.println("Nome do cavalo : " + cav.getNome());
	    System.out.println("Idade do pocoto: " + cav.getIdade());
	    System.out.println("Som que emite: " + cav.getSom());
	    System.out.println("E esse alazao gosta de correr? " + cav.getSom());

	    System.out.println("Nome da Preguica: " + preg.getNome());
	    System.out.println("Idade: " + preg.getIdade());
	    System.out.println("Qual som ela emite? " + preg.getSom());
	    System.out.println("o que essa preguica gosta de fazer? " + preg.getSobe());


	}

}
