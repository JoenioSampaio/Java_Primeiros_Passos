package Vetores_secao06; // Define o pacote do projeto, útil para organização do código

import java.util.Locale; // Importa a classe Locale, usada para configurar a localidade (idioma, formato de números, etc.)
import java.util.Scanner; // Importa a classe Scanner, usada para ler dados do teclado

public class ExercicioResolvido03 { // Declara a classe principal

	public static void main(String[] args) { // Ponto de entrada do programa (execução começa aqui)
		
		Locale.setDefault(Locale.US); // Define o formato dos números para o padrão dos EUA (ex: ponto como separador decimal)
		Scanner sc = new Scanner(System.in); // Cria o objeto Scanner para ler a entrada do usuário
		
		
		int N = sc.nextInt(); // Lê a quantidade de pessoas (tamanho dos vetores)
		
		
		// Declara três vetores para armazenar os dados de cada pessoa
		String[] nomes = new String[N];     // Vetor de nomes (texto)
		int[] idades = new int[N];          // Vetor de idades (inteiros)
		double[] alturas = new double[N];   // Vetor de alturas (números reais)
		
		
		 
		// Loop para preencher os vetores com os dados de cada pessoa
		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();           // Lê o nome da pessoa i
			idades[i] = sc.nextInt();       // Lê a idade da pessoa i
			alturas[i] = sc.nextDouble();   // Lê a altura da pessoa i
		}
		
		
		// Cálculo da altura média
		double soma = 0.0; // Variável acumuladora para somar as alturas
		for (int i = 0; i < N; i++) {
			soma = soma + alturas[i]; // Soma as alturas
		}
		double media = soma / N; // Calcula a média das alturas
		System.out.printf("Altura media: %.2f%n", media); // Imprime a média com duas casas decimais
		
		
		
		// Contagem de pessoas com menos de 16 anos
		int cont = 0; // Contador de pessoas com menos de 16 anos
		for (int i = 0; i < N; i++) {
			if (idades[i] < 16) { // Verifica se a idade da pessoa i é menor que 16
				cont++; // Incrementa o contador
			}
		}
		
		
		
		// Cálculo da porcentagem de pessoas com menos de 16 anos
		double x = (double) cont * 100.0 / N; // Converte para double para evitar divisão inteira e calcula a porcentagem
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x); // Imprime a porcentagem com uma casa decimal
		
		sc.close(); // Fecha o scanner para liberar recursos do sistema
	}
}

/*
Fazer um programa para ler um numero N, depois nome (apenas uma palavra sem espaço), idade e altura de N pessoas, conforme exemplo.
Depois, mostrar na tela a altura média das pessoas, e mostrar tambem a porcentagem de pessoas com menos de 16 anos.

ENTRADA
5
jOAO 15 1.82
MARIA 16 1.60
TERESA 14 1.58
CARLOS 21.1.65
PAULO 17. 1.78

SAIDA 
ALTURA NÉDIA: 1.67
PESSOAS COM MENOS DE 16 ANOS: 40.00%
*/