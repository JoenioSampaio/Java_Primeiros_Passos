package Estrutura_Condicional_Secao04;

import java.util.Scanner;

public class EstruturaCondicionais {

	public static void main(String[] args) {

		// Condicional Simples

		/*
		 * int x = 5;
		 * 
		 * System.out.println("bom dia");
		 * 
		 * 
		 * if (x < 0) {
		 *  System.out.println("boa tarde"); 
		 *  }
		 * 
		 * 
		 * System.out.println("boa noite");
		 */
		
		
		
		// Condicional Composta
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * int hora;
		 * 
		 * System.out.println("Quantas horas?"); 
		 *  hora = sc.nextInt();
		 * 
		 * 
		 * if (hora < 12) {
		 * System.out.println("bom dia"); 
		 * }
		 * 
		 * else { 
		 * System.out.println("boa tarde"); 
		 * }
		 * 
		 * 
		 * sc.close();
		 */
			
			
		// Encadeamento de Estrutura Condicional
		
		
		  Scanner sc = new Scanner(System.in); int hora;
		  
		  System.out.println("Quantas horas?"); 
		  hora = sc.nextInt();
		  
		  
		  if (hora < 12) {
		  System.out.println("bom dia"); 
		  }
		  
		  else if (hora < 18) { 
			System.out.println("Boa tarde");	  
		  }
			  
		  else {
			System.out.println("Boa noite");	  
		  }
		  
		  sc.close();
		 
	}

}
