package ProgramacaoOrientadaObjetos_Secao08;

import java.util.Locale;
import java.util.Scanner;

import entities_Secao08.Product02;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product02 product02 = new Product02();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product02.name = sc.nextLine();
		System.out.print("Price: ");
		product02.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product02.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product02);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product02.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product02);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product02.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product02);
		
		
		sc.close();	
	}

}


/*
Enter product data:
Nome: TV
Prince: 900.00
Quantity in stock: 10

Product data; TV, $ 900.00, 10 units, Total: $ 9000,00
Enter the number of products to be added in stock: 5
updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
Enter the number of products to be removed from stock: 3
update data: TV, $ 900.00, 12 units, Total: $ 10800.00
*/