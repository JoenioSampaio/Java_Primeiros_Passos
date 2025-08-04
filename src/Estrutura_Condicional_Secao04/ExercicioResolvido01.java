package Estrutura_Condicional_Secao04;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;
		
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		
		if (notaFinal < 60.0) {
			System.out.println("REPROVADO");
		}
		

	}

}

/*
Fazer um programa ler as duas notas que um aluno obteve no primeiro e
segundo semestre de uma disciplina anual. Em seguida mostra a nota final que o aluno 
obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior
a 60.00, mostrar a mensagem "REPROVADO", Cconforme exemplo. todos os valores devem ter uma casa decimal.

ENTRADA EXEMPLO 1
45.5
31.3

SAIDA NOTA FINAL = 76.8

EXEMPLO 2

ENTRADA
34.0
23.5

SAIDA NOTA FINAL REPROVADO = 57.5


*/