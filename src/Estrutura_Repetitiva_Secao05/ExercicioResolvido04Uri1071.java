package Estrutura_Repetitiva_Secao05;

import java.util.Scanner;

public class ExercicioResolvido04Uri1071 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min, max;
		if (x < y ) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		for (int i=min+1; i<max; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();		

	}

}


/*
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos numeros impares entre eles.

ENTRADA
O arquivo de entrada contem dois valores inteiros
	
SAIDA
O progrtama deve imprimir um valor inteiro. Este valor é a soma dos valores impares que estão entre os valores 
fornecidos na entrada que devera caber em um inteiro

EXEMPLO DE ENTRADA 01

6 -5

SAIDA
5

EXEMPLO DE ENTRADA 02
15
12

SAIDA 
13

EXEMPLO DE ENTRADA 03
12
12

SAIDA
0




*/