// Define o pacote em que a classe está inserida (organização do projeto)
package Estrutura_Repetitiva_Secao05;

// Importa a classe Locale para configurar a localização padrão do programa
import java.util.Locale;
// Importa a classe Scanner para entrada de dados pelo teclado
import java.util.Scanner;

// Declaração da classe principal
public class EstruturaRepetitiva_Do_While {

    // Método principal - ponto de entrada da aplicação
    public static void main(String[] args) {
        
        // Define o local padrão como US (importante para garantir que o separador decimal seja ponto)
        Locale.setDefault(Locale.US);
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Declara a variável que será usada para controlar a repetição do loop
        char resp;    
        
        // Início do bloco do-while (executa pelo menos uma vez)
        do {
            // Solicita ao usuário que digite a temperatura em Celsius
            System.out.println("Digite a temperatura em Celsius: ");
            // Lê a temperatura em Celsius do usuário
            double C = sc.nextDouble();
            // Converte a temperatura para Fahrenheit usando a fórmula
            double F = 9.0 * C / 5.0 + 32.0;
            // Imprime o resultado formatado com uma casa decimal
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            // Pergunta se o usuário deseja repetir a operação
            System.out.println("Deseja repetir (s/n)? ");
            // Lê a primeira letra da resposta do usuário
            resp = sc.next().charAt(0);
        } 
        // Repete o bloco enquanto a resposta for diferente de 'n'
        while (resp != 'n');

        // Fecha o Scanner (boa prática para liberar recursos)
        sc.close();
    }

}


/*
 * Fazer um programa para leer uma tempereatura em Celsius e mostrar o
 * equivalente em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso
 * o usuário digitr "s", repetir o programa.
 * 
 * Formula: F = 9c / 5 + 32
 * 
 * EXEMPLO
 * 
 * Digite a temperatura em Celsius: 30.0 Equivalente em Fahrenheit: 86.0 Deseja
 * repetir (s/n) s Digite a temperatura em Celsius : 21.0 Equivalente em
 * Fahrenheit: 69.8 Deseja repetir (s/n) ? s Digite a temperatura em Celsius:
 * -10.5 Equivalente em Fahrenheit: 13.1 deseja repetir (s/n)? n
 */