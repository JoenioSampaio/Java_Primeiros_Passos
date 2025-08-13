package ProgramacaoOrientadaObjetos_Secao08;

import java.util.Locale;
import java.util.Scanner;

import entities_Secao08.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Enter /the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areax);
		System.out.printf("Triangle X area: %.4f%n", areay);
		
		if (areax > areay) {
			System.out.println("Larger area: x");
		}
		
		else {
			System.out.println("Larger area: y");
		}
		
		sc.close();
		
		}
	}
	
	/*
 Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
 válidas). Em seguida , mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
 possui a maior área.
 A fórmula paracalcular a área de um triângulo a partir das medidas de seus lados a, b , c é a
 seguinte (fórmula de Heron):  

 Enter the measures of triangle X:
 3.00
 4.00
 5.00
 Enter the measures of triangle Y:
 7.50
 4.50
 4.02
 Triangle X area: 6.0000
 Triangle Y area: 7.5638
 Larger area: Y
	
	*/
