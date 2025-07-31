package Estrutura_Sequencial;

// Classe principal
public class FuncoesMatematicas {

	public static void main(String[] args) {
		
		// Declaração e atribuição de valores às variáveis
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C; // Variáveis auxiliares para armazenar os resultados

		// Cálculo da raiz quadrada usando Math.sqrt()
		A = Math.sqrt(x);         // Raiz quadrada de 3.0
		B = Math.sqrt(y);         // Raiz quadrada de 4.0
		C = Math.sqrt(25.0);      // Raiz quadrada de 25.0

		System.out.println("Valor raiz Quadrada");
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);

		// Cálculo de potência usando Math.pow()
		A = Math.pow(x, y);       // 3.0 elevado a 4.0
		B = Math.pow(x, 2.0);     // 3.0 ao quadrado
		C = Math.pow(5.0, 2.0);   // 5.0 ao quadrado

		System.out.println("Valor de Potencia");
		System.out.println(x + " Elevado a " + y + " = " + A);
		System.out.println(x + " Elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		// Cálculo do valor absoluto usando Math.abs()
		A = Math.abs(y);          // Valor absoluto de 4.0
		B = Math.abs(z);          // Valor absoluto de -5.0 (fica positivo)

		System.out.println("Valor de Absoluto");
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}
}
