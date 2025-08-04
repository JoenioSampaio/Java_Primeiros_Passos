package Estrutura_Condicional_Secao04;

import java.util.Scanner;

public class ExercicioResolvido03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c) {
		System.out.println("MENOR = " + a);
		}
	
		else if (b < c) {
			System.out.println("MENOR = " + b);
		}
		
		else {
			System.out.println("MENOR = " + c);
		}
		
		sc.close();
		
	}

}

/*
Fazer um programa para ler 3 numeros inteiros. Em seguida, mostrar qual o menor dentre os 3 números lidos.
Em caso de empate, mostrar apenas 1 vez.

ENTRADA DE DADOS - EXEMPLO 01
7
3
8

SAIDA DE DADOS
MENOR = 3

ENTRADA DE DADOS - EXEMPLO 02
5
12
5

SAIDA 
MENOR = 5

ENTRADA DE DADOS - EXEMPLO 03
9
9
9

SAIDA 
MENOR = 9
*/