package Estrutura_Repetitiva_Secao05;

import java.util.Scanner;

public class TesteDeMesaComWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int x = 0;
		 int y = 4;
		
		while (x < 3) {
			y = y + 2;
			x = x + 1;
			
			System.out.println(x + "-" + y);
		}
		
		sc.close();

	}

}
