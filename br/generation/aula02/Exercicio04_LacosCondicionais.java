package br.generation.aula02;
import java.lang.Math;
import javax.swing.JOptionPane;


public class Exercicio04_LacosCondicionais {

	public static void main(String[] args) {
		double numero = 0;
		double raiz = 0;
		double potencia = 0; 
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um n�mero: "));
				
		if(numero % 2 == 0) {
			
			raiz = Math.sqrt(numero);
			
			JOptionPane.showMessageDialog(null, "O n�mero � par e sua raiz �:\n " + raiz, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		
		}else {

			potencia = Math.pow(numero, 2);
			
			JOptionPane.showMessageDialog(null, "O n�mero � �mpar e elevado ao quadrado �:\n " + potencia, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

	}

}
