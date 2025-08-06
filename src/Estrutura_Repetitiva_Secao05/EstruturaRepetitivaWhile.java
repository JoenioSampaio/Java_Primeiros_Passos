// Define o pacote onde está a classe (pode ser útil para organização de projetos maiores)
package Estrutura_Repetitiva_Secao05;

// Importa a classe Scanner para ler dados do teclado
import java.util.Scanner;

// Declara a classe principal
public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {
	
		// Cria um objeto Scanner para ler entrada do usuário via console
		Scanner sc = new Scanner(System.in);
		
		// Lê o primeiro número inteiro digitado pelo usuário e armazena em 'x'
		int x = sc.nextInt();
		
		// Inicializa a variável 'soma' com 0 para acumular os valores inseridos
		int soma = 0;

		// Enquanto o valor de 'x' for diferente de 0, continua lendo e somando
		while (x != 0) {
			soma = soma + x; // Soma o valor de 'x' à variável acumuladora 'soma'
			x = sc.nextInt(); // Lê o próximo valor
		}
		
		// Quando 'x' for igual a 0, sai do loop e imprime o total somado
		System.out.println("SOMA TOTAL: " + soma);
		
		// Fecha o objeto Scanner para liberar recursos
		sc.close();
	}
}