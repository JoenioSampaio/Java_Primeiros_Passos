package Estrutura_Repetitiva_Secao05; // Define o pacote onde o arquivo está localizado

import java.util.Locale;
import java.util.Scanner; // Importa classes necessárias para entrada de dados e configuração regional

public class ExercicioResolvido02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define o padrão de localidade para os EUA (importante para separadores decimais)
        Scanner sc = new Scanner(System.in); // Cria o objeto Scanner para ler entradas do usuário

        int idade = sc.nextInt(); // Lê a primeira idade digitada pelo usuário
        int soma = 0;             // Inicializa a variável para armazenar a soma das idades
        int cont = 0;             // Inicializa o contador de idades válidas (não negativas)

        // Enquanto a idade digitada for maior ou igual a 0, continua lendo novas idades
        while (idade >= 0) {
            soma = soma + idade; // Soma a idade à variável "soma"
            cont = cont + 1;     // Incrementa o contador
            idade = sc.nextInt(); // Lê a próxima idade
        }

        // Verifica se ao menos uma idade válida foi digitada
        if (cont > 0) {
            double media = (double) soma / cont; // Calcula a média (casting necessário para resultado com ponto flutuante)
            System.out.printf("%.2f%n", media);  // Exibe a média com duas casas decimais
        } else {
            // Caso nenhuma idade válida tenha sido digitada
            System.out.println("impossivel calcular");
        }

        sc.close(); // Fecha o Scanner para liberar recursos
    }
}




/*
Faça um programa para ler um numemo indeterminado de dados, contendo cada um, a idade de um individuo.
O ultimo dado, que não entrara nos calculos, contem um valor de idade negativa. Calcular e imprimir a idade media deste grupo de individuos.
Se for entrando um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".

ENTRADA EXEMPLO 01
31
27
45
-5

SAIDA 
34.67


ENTRADA EXEMPLO 02
-10

SAIDA 
Impossivel Calcular

*/