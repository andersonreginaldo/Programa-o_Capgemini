package br.com.desafioscapgemini;

import java.util.Scanner;

public class Questao01 {

	/*# Quest�o 01

	Escreva um algoritmo que mostre na tela uma escada de tamanho n 
	utilizando o caractere * e espa�os. A base e altura da escada devem ser 
	iguais ao valor de n. A �ltima linha n�o deve conter nenhum espa�o.*/
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite valor de n: ");
		
		n = leitor.nextInt();
		String[] linha = new String[n];
		
		
		int p = n;

		for (int i=0; i<n; i++) {
			linha[i] = " ";
		}
			
		for (int w = 1; w <= n; w++) {
			linha[p-1] = "*";	
			for (int j=0; j<n; j++) {
				System.out.print(linha[j]);
			}
				System.out.println("");
			p--;
			
		}	
  	
    	leitor.close();
	}
}
