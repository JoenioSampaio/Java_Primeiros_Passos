package ProgramacaoOrientadaObjetos_Secao08; 


import java.util.Locale; 

import java.util.Scanner; 

import entities_Secao08.Employee; 

public class Program02 { 

    public static void main(String[] args) {        // Método principal

        Locale.setDefault(Locale.US);               // Define a localidade para os números (usa ponto como separador decimal)
        Scanner sc = new Scanner(System.in);        // Cria o objeto Scanner para ler entrada do usuário

        Employee emp = new Employee();              // Cria um novo objeto do tipo Employee

        System.out.print("Name ");        			// Solicita o nome do funcionário
        emp.name = sc.nextLine(); 					// Lê o nome digitado pelo usuário e armazena no atributo name

        System.out.print("Gross Salary: ");			// Solicita o salário bruto
        emp.grossSalary = sc.nextDouble(); 			// Lê o salário bruto digitado

        System.out.print("Tax: "); 					// Solicita o valor do imposto
        emp.tax = sc.nextDouble(); 					// Lê o valor do imposto digitado

        System.out.println(); 						// Pula uma linha
        System.out.println("Employee: " + emp); 	// Exibe os dados do funcionário (chama o método toString do objeto emp)

        System.out.println(); 						// Pula uma linha
        System.out.println("Which percentage to increase salary ? "); // Pergunta a porcentagem de aumento
        double percentage = sc.nextDouble(); 		// Lê a porcentagem digitada pelo usuário

        emp.increaseSalary(percentage); 			// Chama o método que aumenta o salário com base na porcentagem

        System.out.println(); 						// Pula uma linha
        System.out.println("Update data: " + emp); 	// Exibe os dados atualizados do funcionário

        sc.close(); 								// Fecha o Scanner (boa prática para liberar recursos)
    }
}