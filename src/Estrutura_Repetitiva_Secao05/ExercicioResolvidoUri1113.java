// Define o pacote onde a classe está localizada
package Estrutura_Repetitiva_Secao05;

// Importa a classe Scanner para permitir entrada de dados pelo teclado
import java.util.Scanner;

// Declara a classe principal com o nome do exercício
public class ExercicioResolvidoUri1113 {

    // Método principal: ponto de entrada da aplicação
    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Lê dois números inteiros digitados pelo usuário
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // Enquanto os dois números forem diferentes, executa o bloco
        while (x != y ) {
            
            // Verifica se x é menor que y
            if (x < y) {
                System.out.println("Crescente"); // Se x < y, imprime "Crescente"
            }
            else {
                System.out.println("Decrescente"); // Se x > y, imprime "Decrescente"
            }
            
            // Lê novamente dois números inteiros para a próxima verificação
            x = sc.nextInt();
            y = sc.nextInt();
        }
        
        // Fecha o scanner para liberar recursos
        sc.close();
    }
}


/*
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem
que indique se estes valores foram crescente ou decrescente.

ENTRADA
A entrada contem vários casos de teste. Cada saso contem dois valores inteiros X e Y.
A leitura deve ser encerrada ao ser fornecer valores iguais para X e Y

SAIDA
Para cada caso de teste imprima "Crescente", caso os valores tenham sido digitados na ordem crescente, 
caso contrario imprima a mensagem "Decrescente."


Exemplo de entrada
54
72
38
22

EXEMPLO DE SAIDA
DECRESCENTE 
DECRESCENTE
CRESCENTE

*/