package URI_Estrutura_De_Dados_Secao03;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = 2.0 * (base + altura);
		double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura,  2.0));
		
		System.out.printf("AREA= %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();

	}

}

/*
 * Fazer um programa para ler as medidas da base e altura de um retangulo. Em
 * seguida, mostrar o valor da ária, perimetro e diagonal deste retangulo com
 * quatro casas decimais, conforme exemplo. 
 * Entrada 5.0 4.0
 * 
 * saida
 * AREA = 20.0000 
 * PERIMETRO = 18.0000 
 * DIAGONAL = 6.4031 
 */