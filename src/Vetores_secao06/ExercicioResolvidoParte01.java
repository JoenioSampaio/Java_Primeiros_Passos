package Vetores_secao06; // Define o pacote onde a classe está localizada

import java.util.Locale; // Importa a classe Locale para configurar o formato regional
import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class ExercicioResolvidoParte01 { // Declaração da classe principal

	public static void main(String[] args) { // Método principal, ponto de entrada do programa
		
		Locale.setDefault(Locale.US); // Define o formato numérico para o padrão dos EUA (ex: ponto decimal)
		Scanner sc  = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário
		
		int N = sc.nextInt(); // Lê um número inteiro que representa o tamanho do vetor
		int[] vet = new int [N]; // Declara e aloca um vetor de inteiros com tamanho N
		
		for (int i = 0; i < N; i++) { // Loop para preencher o vetor
			vet[i] = sc.nextInt(); // Lê um número inteiro e armazena na posição i do vetor
		}
		
		for (int i = 0; i < N; i++) { // Loop para percorrer o vetor novamente
			if (vet[i] < 0) { // Verifica se o valor na posição i é negativo
				System.out.println(vet[i]); // Se for negativo, imprime o valor
			}
		}
		
		sc.close(); // Fecha o Scanner para liberar recursos
	}
}


/*

Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

Entrada 
6 N
8 -2 9 10 -3 -7

Saida
-2
-3
-7

*/