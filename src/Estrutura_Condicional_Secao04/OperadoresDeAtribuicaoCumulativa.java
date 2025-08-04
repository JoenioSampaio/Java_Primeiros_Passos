package Estrutura_Condicional_Secao04;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresDeAtribuicaoCumulativa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.00;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f", + conta);
		
		
		sc.close();
		
		

	}

}



/*
Uma operadora de telefonia cobra R$ 50,00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exeder a franquia de 100 minutos 
custa R$ 2,00. Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu,
dai mostramos o valor a ser pago.

ENTRADA DE DADOS
22

SAIDA DE DADOS
Valor a Pagar =  R$ 50,00

ENTRADA DE DADOS
103


SAIDA DE DADOS
Valor a Pagar = R$ 56,00



*/
