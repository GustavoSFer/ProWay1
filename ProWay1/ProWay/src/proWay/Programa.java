/*
 * @author Gustavo dos Santos Fernandes
 * @version 1.0
 */
package proWay;

import java.util.Scanner;

public class Programa {
	static int pontuacao[] = new int[1000], maximo=0, minimo=1000, pontmin=0, pontmax=0; 
	static int opcao = 1;
	static Scanner ler = new Scanner (System.in);
	static int i =0;
	
	public static void main(String[] args) {
	
		/* Desta forma toda vez que a pessoa quiser cadastrar sua pontua��o de um novo jogo
		 * pode chamar a Fun��o cadastrarPontos().
		*/
		cadastrarPontos();
		cadastrarPontos();
		cadastrarPontos();
		cadastrarPontos();
		cadastrarPontos();
		
		mostrarDados();
		
		
		ler.close();
		
		
	}
	
	// FUN�OES
	
	static void cadastrarPontos() {	
			System.out.println("Informe a sua pontua��o do jogo: ");
			pontuacao[i] = ler.nextInt();
		
				if( pontuacao[i] > maximo) {
					maximo = pontuacao[i];
					pontmax++;					//Desta forma toda vez que a pontua��o for maior, ja vai contabilizando.
				}
				if(pontuacao[i] < minimo) {
					minimo = pontuacao[i];
					pontmin++;
				}
		i++;									// Uma forma de incremento, caso precise ver as pontua��o de cada jogo. (usando o comando FOR)
		
	}
	
	static void mostrarDados() {
		System.out.println("A sua maior pontua��o durante a temporada foi de: " + maximo);
		System.out.println("A sua menor pontua��o durante a temporada foi de: " + minimo);
		System.out.println("A quantidade de pontua��o maxima foi alcan�ado: " + pontmax + " vezes.");
		System.out.println("A quantidade de pontua��o minima foi alcan�ado: " + pontmin + " vezes.");
	}

}
