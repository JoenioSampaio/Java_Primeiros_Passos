package ProgramacaoOrientadaObjetos_Secao08; // Pacote onde a classe está localizada

import java.util.Locale;       // Importa a classe Locale para configurar a localidade (ponto decimal)
import java.util.Scanner;      // Importa a classe Scanner para entrada de dados

import entities_Secao08.Rectangle01;         // Importa a classe Rectangle01 de outro pacote

public class Program01 {        // Declaração da classe principal

    public static void main(String[] args) {       // Método principal do programa

        Locale.setDefault(Locale.US);             // Define a localidade para usar ponto como separador decimal
        Scanner sc = new Scanner(System.in);     // Cria o objeto Scanner para ler entrada do usuário

        Rectangle01 rect = new Rectangle01();    // Cria um novo objeto da classe Rectangle01

        System.out.println("Enter rectangle width and height:"); // Pede ao usuário os dados do retângulo
        rect.width = sc.nextDouble();           // Lê a largura do retângulo e armazena no objeto
        rect.height = sc.nextDouble();         // Lê a altura do retângulo e armazena no objeto

        System.out.printf("Area = %.2f%n", rect.area());            // Imprime a área do retângulo com 2 casas decimais
        System.out.printf("Perimeter = %.2f%n", rect.perimeter());  // Imprime o perímetro do retângulo
        System.out.printf("Diagonal = %.2f%n", rect.diagonal());    // Imprime a diagonal do retângulo

        sc.close();                                                 // Fecha o Scanner para liberar recursos
    }
}