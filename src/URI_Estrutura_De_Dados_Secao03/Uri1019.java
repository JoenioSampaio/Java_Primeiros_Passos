// Pacote onde o arquivo está localizado (opcional, dependendo do projeto)
package URI_Estrutura_De_Dados_Secao03;

// Importa a classe Scanner, usada para ler dados do teclado
import java.util.Scanner;

// Declaração da classe principal
public class Uri1019 {

    // Método principal: ponto de entrada da aplicação
    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Declaração das variáveis inteiras
        int N, horas, minutos, segundos, resto;
        
        // Lê um valor inteiro da entrada (tempo em segundos)
        N = sc.nextInt();
        
        // Calcula a quantidade de horas inteiras no total de segundos
        horas = N / 3600;

        // Calcula o restante de segundos que sobram depois de extrair as horas
        resto = N % 3600;     
        
        // Calcula a quantidade de minutos inteiros no restante
        minutos = resto / 60;

        // Calcula os segundos restantes após extrair as horas e os minutos
        segundos = resto % 60;
        
        // Exibe o resultado no formato horas:minutos:segundos
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        // Encerra o Scanner (boa prática)
        sc.close();
    }

}

/*
Leia um valor inteiro que é o tempo de duração em segundos de um determinado evento em uma fabrica,
e informe-o expresso no formato horas: minutos; segundos.

Entrada
O arquivo de entrada contem um valor inteiro N.

Saida 
Imprima o tempo lido no arqui=vo de entrada (segundos). Convertendo para horas ; minitos; segundos, conforme exemplo fornecido.

Entrada - SEGUNDOS

556
1
140153   QUANTAS HORAS TEM  / 3600 segundos correspondentes a hora

Saida
0:9:16
0:0:1
38:55:53

*/