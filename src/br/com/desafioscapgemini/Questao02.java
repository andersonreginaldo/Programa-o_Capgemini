package br.com.desafioscapgemini;

import java.util.Scanner;

public class Questao02 {
	
	/*D�bora se inscreveu em uma rede social para 
	  se manter em contato com seus amigos. A p�gina 
	  de cadastro exigia o preenchimento dos campos 
	  de nome e senha, por�m a senha precisa ser forte. 
	  O site considera uma senha forte quando ela satisfaz 
	  os seguintes crit�rios:
	 	Possui no m�nimo 6 caracteres.
		Cont�m no m�nimo 1 digito.
		Cont�m no m�nimo 1 letra em min�sculo.
		Cont�m no m�nimo 1 letra em mai�sculo.
		Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
		
		D�bora digitou uma string aleat�ria no campo de senha, 
		por�m ela n�o tem certeza se � uma senha forte. 
		Para ajudar D�bora, construa um algoritmo que informe qual 
		� o n�mero m�nimo de caracteres que devem ser adicionados para 
		uma string qualquer ser considerada segura.
	 */
	public static void main(String[] args) {


		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite senha: ");
		String senha = leitor.next();

	    if (senha.length()<6) {
			int x = 6-senha.length(); 
			System.out.println(x);
		}
		
		
		leitor.close();
	
	}

}
