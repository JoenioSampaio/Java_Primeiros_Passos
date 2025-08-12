package Matizes_Secao07; // Define o pacote onde a classe está. Organiza o código por seções/módulos.

import java.util.Scanner; // Importa a classe Scanner para permitir a leitura de dados pelo teclado.

public class ExercicioResolvido01 { // Declaração da classe principal do programa.

	public static void main(String[] args) { // Método principal: ponto inicial da execução do programa.
		
		Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para receber entrada do usuário via teclado.
		
		int N = sc.nextInt(); // Lê um número inteiro N, que será usado como tamanho da matriz quadrada NxN.

		int[][] matriz = new int[N][N]; // Declara e instancia uma matriz de inteiros com N linhas e N colunas (matriz quadrada).
		
		
		// Preenchimento da matriz com dados fornecidos pelo usuário
		for (int i = 0; i < N; i++) { // Percorre cada linha da matriz
			for (int j = 0; j < N; j++) { // Percorre cada coluna da linha atual
				matriz[i][j] = sc.nextInt(); // Lê um número inteiro e armazena na posição [i][j] da matriz
			}
		}
		
		
		System.out.println("DIAGONAL PRINCIPAL: "); // Exibe o título da saída referente à diagonal principal da matriz
		
		// Impressão da diagonal principal
		for (int i = 0; i < N; i++) { // Percorre os índices das linhas (e colunas, já que i == j na diagonal)
			System.out.println(matriz[i][i] + " "); // Imprime o elemento da posição [i][i], que está na diagonal principal
		}
		System.out.println(); // Pula uma linha para separar visualmente as seções de saída
		
		int cont = 0; // Inicializa um contador para contar números negativos na matriz
		
		
		
		// Percorre toda a matriz para contar os elementos negativos
		for (int i = 0; i < N; i++) { // Percorre cada linha
			for (int j = 0; j < N; j++) { // Percorre cada coluna da linha atual
				if (matriz[i][j] < 0) { // Verifica se o elemento da posição [i][j] é negativo
					cont = cont + 1; // Incrementa o contador se o número for negativo
				}
			}
		}
		
		System.out.println("QUANTIDADE DE NEGATIVOS = " + cont); // Exibe a quantidade total de números negativos encontrados
		
		sc.close(); // Fecha o objeto Scanner para liberar os recursos do sistema (boa prática de programação)
	}
}

/*
Fazer um programa para ler um numero inteiro N e uma matriz quadrada de ordem N contendo números inteiros. 
Em seguida, mostra a diagonal principal e a quantidade de valores negativos da matriz.

Entrada 
3 N
5 -3 10 
15 8 2
7 9 -4

Saida 
DIAGNAL PRINCIPAL:
5 8 -4
QUANTIDADE DE NEGATIVOS = 2

*/