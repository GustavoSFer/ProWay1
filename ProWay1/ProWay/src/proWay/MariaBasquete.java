package proWay;

import java.util.Scanner;

public class MariaBasquete {
	public static void main(String[] args) {
		
		
	
		int pontua��o[] = new int[1000], maximo=0, minimo=1000, pontmin=0, pontmax=0; 
		int opcao = 1;
		Scanner ler = new Scanner (System.in);
		int i =0;
		
		
		while(opcao > -1) {		
				System.out.println("Qual a pontua��o no "+ (i+1)+ "� jogo: ");
					pontua��o[i] = ler.nextInt();
			
					if( pontua��o[i] > maximo) {
						maximo = pontua��o[i];
						pontmax++;
					}
					if(pontua��o[i] < minimo) {
						minimo = pontua��o[i];
						pontmin++;
					}
			i++;
			System.out.println("Deseja sair do cadastro de pontua��o? \ntecle '-1' para sair '0' para continuar");
			opcao = ler.nextInt();
		}
		
		System.out.println("A sua maior pontua��o durante a temporada foi de: " + maximo);
		System.out.println("A sua menor pontua��o durante a temporada foi de: " + minimo);
		System.out.println("A quantidade de pontua��o maxima foi alcan�ado: " + pontmax + " vezes.");
		System.out.println("A quantidade de pontua��o minima foi alcan�ado: " + pontmin + " vezes.");
		
		ler.close();
	}
	
}
