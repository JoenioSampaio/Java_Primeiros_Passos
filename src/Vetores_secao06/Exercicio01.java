package Vetores_secao06; // Define o pacote onde a classe está localizada

import java.util.Locale; // Importa a classe Locale para configuração regional
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Exercicio01 { // Declaração da classe principal

	public static void main(String[] args) { // Método principal
		
		Locale.setDefault(Locale.US); // Define o formato de ponto decimal como o dos EUA (usa ponto ao invés de vírgula)
		Scanner sc = new Scanner (System.in); // Cria um objeto Scanner para ler dados do usuário
		
		int N = sc.nextInt(); // Lê o número de elementos que o vetor terá
		double [] vet = new double [N]; // Declara e instancia um vetor de doubles com tamanho N
		
		for (int i = 0; i < N; i++) { // Loop para ler os valores do vetor
			vet[i] = sc.nextDouble(); // Lê e armazena cada valor no vetor
 		}
		
		for (int i = 0; i < N; i++) { // Loop para imprimir os valores do vetor
			System.out.printf("%.2f%n", vet[i]); // Imprime cada valor com 2 casas decimais
		}
		 
		sc.close(); // Fecha o Scanner para liberar recursos
	}
}
/*
Fazer um programa para ler um numero inteiro positivo N, depois ler N numeros quaisquer e armazená-los em um vetor.
Em seguida, mostrar na tela todos elementos do vetor.

ENTRADA
4
10.5
4.2
-7.1
15.0

SAIDA
10.5
4.2
-7.1
15.0
*/