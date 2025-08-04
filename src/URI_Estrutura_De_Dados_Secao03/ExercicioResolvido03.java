package URI_Estrutura_De_Dados_Secao03; // Define o pacote onde a classe está localizada

import java.util.Locale;  // Importa a classe Locale para configurar o formato de ponto/flutuação (ex: "." como separador decimal)
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do teclado

public class ExercicioResolvido03 { // Declaração da classe principal

    public static void main(String[] args) { // Método principal, onde a execução começa

    	Locale.setDefault(Locale.US); // Define o padrão de localização para o sistema (ex: ponto em vez de vírgula em números decimais)
    	Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados pelo teclado
    	
    	// Lê o primeiro nome digitado (até o primeiro espaço)
    	String nome1 = sc.next();
    	
    	// Lê a idade correspondente ao primeiro nome
    	int idade1 = sc.nextInt();
    	
    	// Lê o segundo nome digitado (até o primeiro espaço)
    	String nome2 = sc.next();
    	
    	// Lê a idade correspondente ao segundo nome
    	int idade2 = sc.nextInt();
    	
    	// Calcula a média das idades. O casting para double garante resultado decimal preciso.
    	double media = (double) (idade1 + idade2) / 2;
    	
    	// Exibe a mensagem formatada com os nomes e a média das idades (com uma casa decimal)
    	System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);
    	
    	sc.close(); // Fecha o Scanner (boa prática para liberar recursos)
    }
}

/*
 * Fazer um programa para ler o nome (apenas uma palavra) e idade de duas
 * pessoas. Ao final mostrar uma mensagem com os nomes e a idade media entre
 * essas pessoas, com uma casa decimal, conforme exemplo.
 * 
 * 
 * Entrada 
 * Maria 19
 * Joaquim 20
 * 
 * Saída 
 * À idade média de Maria e Joaquim é de 19.5 anos
 */