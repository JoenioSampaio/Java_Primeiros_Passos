package Matizes_Secao07; // Define o pacote do projeto. Útil para organização do código em módulos.
 
import java.util.Scanner; // Importa a classe Scanner, necessária para ler dados do teclado.

public class ProblemaExemplo { // Declaração da classe principal do programa.

	public static void main(String[] args) { // Método principal: ponto de entrada da execução.
		
		Scanner sc = new Scanner(System.in); // Cria o objeto Scanner para permitir entrada de dados pelo teclado.
		 
		int M = sc.nextInt(); // Lê o número de linhas da matriz. Importante para definir o tamanho da estrutura.
		int N = sc.nextInt(); // Lê o número de colunas da matriz. Também essencial para a alocação correta.
		
		int[][] matriz = new int[M][N]; // Declara e instancia uma matriz de inteiros com M linhas e N colunas.
		
		
		for (int i = 0; i < M; i++) { // Percorre cada linha da matriz.
			for (int j = 0; j < N; j++) { // Percorre cada coluna da linha atual.
				matriz[i][j] = sc.nextInt(); // Lê um número inteiro do usuário e armazena na posição [i][j] da matriz.
			}
		}
		
		
		for (int i = 0; i < M; i++) { // Percorre novamente cada linha da matriz.
			for (int j = 0; j < N; j++) { // Percorre cada coluna da linha atual.
				System.out.print(matriz[i][j] + " "); // Imprime o valor armazenado na posição [i][j], seguido de espaço.
			}
			System.out.println(); // Ao final de cada linha, pula uma linha para formatar a saída como uma matriz.
		}	
		
		
		
		sc.close(); // Fecha o Scanner para liberar recursos do sistema (boa prática).
	}
}


/*
Fazer um programa para ler dois números inteiros positivos M e N, depois ler uma
matriz de M minhas e N colunas contendo números inteiros. Em seguida, mostrar na tela a matriz lida conforme exemplo.

ENTRADA
2 3
6 3 10
8 12 5

SAIDA
6 3 10
8 12 5
*/