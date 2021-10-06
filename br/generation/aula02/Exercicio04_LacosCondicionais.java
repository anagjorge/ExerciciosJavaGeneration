package br.generation.aula02;
import java.lang.Math;
import javax.swing.JOptionPane;


public class Exercicio04_LacosCondicionais {

	public static void main(String[] args) {
		double numero = 0;
		double raiz = 0;
		double potencia = 0; 
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
				
		if(numero % 2 == 0) {
			
			raiz = Math.sqrt(numero);
			
			JOptionPane.showMessageDialog(null, "O número é par e sua raiz é:\n " + raiz, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		
		}else {

			potencia = Math.pow(numero, 2);
			
			JOptionPane.showMessageDialog(null, "O número é ímpar e elevado ao quadrado é:\n " + potencia, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

	}

}
