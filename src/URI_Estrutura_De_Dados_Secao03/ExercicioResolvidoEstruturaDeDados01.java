package URI_Estrutura_De_Dados_Secao03;     // Define o pacote onde o arquivo está localizado

import java.util.Locale;       // Importa a classe Locale para configurar o formato de números (como ponto decimal)
import java.util.Scanner;      // Importa a classe Scanner para ler dados digitados pelo usuário

public class ExercicioResolvidoEstruturaDeDados01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);     // Define o padrão de formatação numérica para o estilo dos EUA (usa ponto como separador decimal)

		Scanner sc = new Scanner(System.in);    // Cria um objeto Scanner para ler dados do teclado
		
		// Lê três valores digitados pelo usuário e armazena nas variáveis
		double largura = sc.nextDouble();           // Lê a largura do terreno
		double comprimento = sc.nextDouble();        // Lê o comprimento do terreno
		double metroQuadrado = sc.nextDouble();     // Lê o valor do metro quadrado

		// Calcula a área do terreno (largura x comprimento)
		double area = largura * comprimento;

		// Calcula o preço total (área x valor do metro quadrado)
		double preco = area * metroQuadrado;

		// Exibe a área com 2 casas decimais
		System.out.printf("Area = %.2f\n" , area);

		// Exibe o preço total com 2 casas decimais
		System.out.printf("preco = %.2f\n " , preco);

		sc.close();     // Fecha o Scanner para liberar recursos do sistema
	}
}
