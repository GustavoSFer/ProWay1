package proWay;

import java.util.Scanner;

public class MariaBasquete {
	public static void main(String[] args) {
		
		
	
		int pontuação[] = new int[1000], maximo=0, minimo=1000, pontmin=0, pontmax=0; 
		int opcao = 1;
		Scanner ler = new Scanner (System.in);
		int i =0;
		
		
		while(opcao > -1) {		
				System.out.println("Qual a pontuação no "+ (i+1)+ "ª jogo: ");
					pontuação[i] = ler.nextInt();
			
					if( pontuação[i] > maximo) {
						maximo = pontuação[i];
						pontmax++;
					}
					if(pontuação[i] < minimo) {
						minimo = pontuação[i];
						pontmin++;
					}
			i++;
			System.out.println("Deseja sair do cadastro de pontuação? \ntecle '-1' para sair '0' para continuar");
			opcao = ler.nextInt();
		}
		
		System.out.println("A sua maior pontuação durante a temporada foi de: " + maximo);
		System.out.println("A sua menor pontuação durante a temporada foi de: " + minimo);
		System.out.println("A quantidade de pontuação maxima foi alcançado: " + pontmax + " vezes.");
		System.out.println("A quantidade de pontuação minima foi alcançado: " + pontmin + " vezes.");
		
		ler.close();
	}
	
}
