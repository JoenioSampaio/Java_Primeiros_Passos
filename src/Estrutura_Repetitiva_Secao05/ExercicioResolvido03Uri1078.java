package Estrutura_Repetitiva_Secao05;

import java.util.Scanner;

public class ExercicioResolvido03Uri1078 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			int produto = i * N;
			System.out.println(i + " x " + N + " = " + produto);
		}
		
		sc.close();
	

	}

}


/*
Leia um valor inteiro N (2<N<1000). A seguir, mostre a tabuada de N:

ENTRADA
A entrada contem um valor inteiro N (2<N< 1000).

SAIDA 
Imprima a tabuada de N, conforme o exemplo fornecido.
*/