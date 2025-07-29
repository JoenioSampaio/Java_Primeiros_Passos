package Estrutura_Sequencial;

import java.util.Locale;

public class atividadeSaidaDeDados {

	public static void main(String[] args) {
		
		String product1 = "Computador";
		String product2 = "Mesa de Escritório";
		
		byte idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, cujo preço é R$ %.2f\n", product1, preco1);
		System.out.printf("%s, cujo preço é R$ %.2f\n", product2, preco2);
		System.out.println();
		System.out.printf("Registro: %d anos de idade, código %d e gênero: %c%n", idade, codigo, genero);
		System.out.println();
		System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
		System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal no formato dos EUA: %.3f%n", medida);

	}

}
