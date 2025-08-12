package Matizes_Secao07; // Define o pacote onde essa classe está inserida, usado para organização do código.

import java.util.Locale; // Importa a classe Locale, usada para configurar o formato de números, datas, etc.
import java.util.Scanner; // Importa a classe Scanner, usada para ler entrada do teclado.

public class ExercicioResolvido02 { // Declaração da classe principal.

	public static void main(String[] args) { // Método principal - ponto de entrada da execução do programa.
		
		Locale.setDefault(Locale.US); // Define o padrão de ponto flutuante (usa ponto em vez de vírgula como separador decimal).
		Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para leitura de dados digitados pelo usuário.
		
		int M = sc.nextInt(); // Lê um número inteiro que representa a quantidade de linhas da matriz.
		int N = sc.nextInt(); // Lê um número inteiro que representa a quantidade de colunas da matriz.
		
		double[][] numeros = new double[M][N]; // Declara e cria uma matriz de números decimais com M linhas e N colunas.
		
		
		// Preenche a matriz com os valores fornecidos pelo usuário
		for (int i = 0; i < M; i++) { // Percorre cada linha
			for (int j = 0; j < N; j++) { // Percorre cada coluna da linha atual
				numeros[i][j] = sc.nextDouble(); // Lê e armazena um número decimal na posição [i][j]
			}
		}
		
		double[] vet = new double[M]; // Cria um vetor para armazenar a soma dos elementos de cada linha da matriz.
		
		
		// Calcula a soma dos elementos de cada linha da matriz
		for (int i = 0; i < M; i++) { // Para cada linha da matriz
			double soma = 0.0; // Inicializa a variável de soma
			for (int j = 0; j < N; j++) { // Percorre as colunas da linha atual
				soma = soma + numeros[i][j]; // Soma os valores da linha
			}
			vet[i] = soma; // Armazena a soma da linha no vetor
		}
		
		
		// Imprime o vetor com as somas das linhas
		for (int i = 0; i < M; i++) // Percorre o vetor de somas
			System.out.printf("%.1f%n", vet[i]); // Imprime cada valor com uma casa decimal e quebra de linha
		
		sc.close(); // Fecha o objeto Scanner (boa prática para liberar recursos do sistema).
	}
}

/*
Fazer um programa para ler dois números M e N. Em seguida, ler uma matriz de M linhas e N colunas contendo números double.
Gerar um vetor de modo que cada elemento do vetor seja a soma dos elementos da linha correspondente da matriz.
mostrar o vetor gerado.

ENTRADA
2 3
 7.0 8.0 10.0
 2.0 3.0 5.0
 
 SAIDA 25.0
 10.0
 
*/