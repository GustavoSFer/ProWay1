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
	
		/* Desta forma toda vez que a pessoa quiser cadastrar sua pontuação de um novo jogo
		 * pode chamar a Função cadastrarPontos().
		*/
		cadastrarPontos();
		cadastrarPontos();
		cadastrarPontos();
		cadastrarPontos();
		cadastrarPontos();
		
		mostrarDados();
		
		
		ler.close();
		
		
	}
	
	// FUNÇOES
	
	static void cadastrarPontos() {	
			System.out.println("Informe a sua pontuação do jogo: ");
			pontuacao[i] = ler.nextInt();
		
				if( pontuacao[i] > maximo) {
					maximo = pontuacao[i];
					pontmax++;					//Desta forma toda vez que a pontuação for maior, ja vai contabilizando.
				}
				if(pontuacao[i] < minimo) {
					minimo = pontuacao[i];
					pontmin++;
				}
		i++;									// Uma forma de incremento, caso precise ver as pontuação de cada jogo. (usando o comando FOR)
		
	}
	
	static void mostrarDados() {
		System.out.println("A sua maior pontuação durante a temporada foi de: " + maximo);
		System.out.println("A sua menor pontuação durante a temporada foi de: " + minimo);
		System.out.println("A quantidade de pontuação maxima foi alcançado: " + pontmax + " vezes.");
		System.out.println("A quantidade de pontuação minima foi alcançado: " + pontmin + " vezes.");
	}

}
