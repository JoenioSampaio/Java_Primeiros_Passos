package Estrutura_Condicional_Secao04;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02Uri1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		 
		double delta = b * b - 4.0 * a * c;
		
		if (a == 0 || delta < 0.0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}
		
		else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		
		sc.close();
		

	}

}

/*
Leia 3 valores de ponto flutuante e efetue o calculo das raizes da equação de Bhaskara. Se não for possivel
calcular as raizes, mostre a mensagem correspondente "Impossivel calcular" , caso haja uma divisão por , 0 ou raiz 
de numero negativo.

ENTRADA
Leia 3 valores de ponto flutuante

SAIDA	
Se não houver possibilidae de calcular as raizes, apresente a mensagem "Impossivel calcular". Caso contrario,
imprima os resultados das raizes com 5 digitos após o ponto, com uma mensagem correspondente conforme exemplo 
abaixo. Imprima sempre o final de linha apos cada mesagem.

EXEMPLO DE ENTRADA 01
10.0 
20.1
5.1

SAIDA DE DADOS 
R1 = -0.29788
R2 = -1.71212

EXEMPLO DE ENTRADA 02
0.0
20.0
5.0

SAIDA DE DADOS
Impossivel calcular


EXEMPLO DE ENTRADA 03
10.3
203.0
5.0

SAIDA DE DADOS
R1 = -0.02466
R2 = -19.68408


*/