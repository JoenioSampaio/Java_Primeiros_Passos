package Estrutura_Repetitiva_Secao05;

import java.util.Scanner;

public class EstruturaRepetitivaFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i=0; i<N; i++) {
			int X = sc.nextInt();
			soma = soma + X;
		}
		
		System.out.println(soma);
		
		
		sc.close();

	}

}

/*
	Fazer um programa que lê um valro inteiro N e depois N numeros inteiros.
	Ao final, Mostrar a soma dos N números lidos.
	
	ENTRADA
	3
	5
	2
	4
	
	SAIDA
	11



*/