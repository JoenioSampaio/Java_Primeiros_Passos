package Estrutura_Condicional_Secao04;

import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int x = sc.nextInt();
		 
		 String dia;
		 
		 if (x == 1) {
		 dia = "domingo";
		 }
		 else if (x == 2) {
		 dia = "segunda";
		 }
		 else if (x == 3) {
		 dia = "terca";
		 }
		 else if (x == 4) {
		 dia = "quarta";
		 }
		 else if (x == 5) {
		 dia = "quinta";
		 }
		 else if (x == 6) {
		 dia = "sexta";
		 }
		 else if (x == 7) {
		 dia = "sabado";
		 }
		 else {
		 dia = "valor invalido";
		 }
		 System.out.println("Dia da semana: " + dia);
		 sc.close();

	}

}

/* 
Fazer um programa para ler um valor de 1 a 7 representando um dia da semana
(sendo 1 = domingo, 2=  segunda, e assim por diante). Escrever na tela o dia da semana correspondente, conforme exemplos.

ENTRADA = 1  SAIDA = DIA DA SEMANA: DOMINGO.
ENTRADA = 4  SAIDA = DIA DA SEMANA: QUARTA.
ENTRADA = 9  SAIDA = DIA DA SEMANA: VALOR INVALIDO.
*/






