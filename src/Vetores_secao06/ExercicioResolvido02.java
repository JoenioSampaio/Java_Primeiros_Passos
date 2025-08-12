package Vetores_secao06; // Define o pacote onde essa classe está inserida (organização do código)

import java.util.Locale; // Importa a classe Locale para definir configurações regionais (como separador decimal)
import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class ExercicioResolvido02 { // Declara a classe principal do programa

	public static void main(String[] args) { // Método principal: ponto de entrada da aplicação

	Locale.setDefault(Locale.US); // Define o padrão de localização para EUA (usa ponto como separador decimal)
	Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário pelo teclado
		
	
	int N = sc.nextInt(); // Lê um número inteiro que representa o tamanho do vetor
	double[] vet = new double[N]; // Cria um vetor de números reais (double) com tamanho N
	
	
	for (int i = 0; i < N; i++) { // Loop que percorre de 0 até N-1
		vet[i] = sc.nextDouble(); // Lê um número real e armazena na posição i do vetor
	}
	
	
	for (int i = 0; i < N; i++) { // Loop para exibir todos os elementos do vetor
		System.out.print(vet[i] + " "); // Imprime cada número separado por espaço (na mesma linha)
	}
	System.out.println(); // Pula uma linha após imprimir todos os elementos
	
	
	double soma = 0.0; // Inicializa a variável que armazenará a soma dos elementos
	for (int i = 0; i < N; i++) { // Loop que percorre o vetor novamente
		soma = soma + vet[i]; // Acumula a soma de todos os elementos do vetor
	}
	System.out.printf("%.2f%n", soma); // Imprime a soma total com 2 casas decimais
	
	double media = soma / N; // Calcula a média dos elementos
	System.out.printf("%.2f%n", media); // Imprime a média com 2 casas decimais
	
	sc.close(); // Fecha o objeto Scanner (boa prática para liberar recursos do sistema)
	}
}


/*

Faça um programa que leia N números reais e armazene-os em um vetor.
Em seguida:
- Imprima todos os elementos do vetor
- Mostrar na tela a soma e a médida dos elementos do vetor

Entrada 
4 N
8.0 4.0 10.0 14.0 



saida 
8.0 4.0 10.0 14.0 
36.00
9.00

*/