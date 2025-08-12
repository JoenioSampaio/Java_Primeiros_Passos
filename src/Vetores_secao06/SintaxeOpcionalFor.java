package Vetores_secao06;

import java.util.Scanner;


public class SintaxeOpcionalFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[]  nomes = new String[N];
		
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
		}
		
		System.out.println("Nomes lidos:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		
		sc.close();
		
	}

}

/*
Fazer um programa para ler um valor N e depois o nome de N pessoas.
Em seguida, mostrar os nomes lidos.

ENTRADA 
3
MARIA
JOAQUIM
ANA

SAIDA
Nomes Lidos:
MARIA 
JOAQUIM ANA
*/