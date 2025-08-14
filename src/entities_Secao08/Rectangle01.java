package entities_Secao08;           // Define o pacote onde a classe está localizada

public class Rectangle01 {          // Declaração da classe Rectangle01

    public double width;            // Atributo público que representa a largura do retângulo
    public double height;           // Atributo público que representa a altura do retângulo

    public double area () {          // Método que calcula a área do retângulo
        return width * height;       // Retorna a multiplicação da largura pela altura
    }

    public double perimeter() {       // Método que calcula o perímetro do retângulo
        return 2 * (width + height);  // Retorna a soma dos lados multiplicada por 2
    }

    public double diagonal() {        // Método que calcula a diagonal do retângulo
        return Math.sqrt(width * width + height * height); // Usa o Teorema de Pitágoras para calcular a diagonal
    }
}

