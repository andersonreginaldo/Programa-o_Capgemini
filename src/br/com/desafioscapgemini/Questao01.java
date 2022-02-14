package br.com.desafioscapgemini;

import java.util.Scanner;

public class Questao01 {

	/*# Questão 01

	Escreva um algoritmo que mostre na tela uma escada de tamanho n 
	utilizando o caractere * e espaços. A base e altura da escada devem ser 
	iguais ao valor de n. A última linha não deve conter nenhum espaço.*/
	
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
