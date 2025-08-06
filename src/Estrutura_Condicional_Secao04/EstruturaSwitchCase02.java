package Estrutura_Condicional_Secao04;

import java.util.Scanner;

public class EstruturaSwitchCase02 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int x = sc.nextInt();
		 
		 String dia;
		 switch (x) {
		 case 1:
		 dia = "domingo";
		 break;
		 case 2:
		 dia = "segunda";
		 break;
		 case 3:
		 dia = "terca";
		 break;
		 case 4:
		 dia = "quarta";
		 break;
		 case 5:
		 dia = "quinta";
		 break;
		 case 6:
		 dia = "sexta";
		 break;
		 case 7:
		 dia = "sabado";
		 break;
		 default:
		 dia = "valor invalido";
		 break;
		 }
		 
		 
		 System.out.println("Dia da semana: "+ dia);
		 sc.close();

	}

}


/* 
Fazer um programa para ler um valor de 1 a 7 representando um dia da semana
(sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o dia da semana correspondente, conforme exemplos.

ENTRADA = 1  SAIDA = DIA DA SEMANA: DOMINGO.
ENTRADA = 4  SAIDA = DIA DA SEMANA: QUARTA.
ENTRADA = 9  SAIDA = DIA DA SEMANA: VALOR INVALIDO.
 
*/