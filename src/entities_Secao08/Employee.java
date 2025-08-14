package entities_Secao08;

public class Employee {
	
	public String name; 											// Nome do funcionário
	public double grossSalary;										// Salário bruto (antes dos descontos)
	public double tax; 												// Valor do imposto a ser descontado

	public double netSalary() { 									// Método que calcula o salário líquido
	    return grossSalary - tax; 									// Retorna o salário bruto menos o imposto
	}

	public void increaseSalary(double percentage) { 				// Método para aumentar o salário
	    grossSalary += grossSalary * percentage / 100.0; 			// Aumenta o salário em uma porcentagem fornecida
	}

	public String toString() { 										// Método que retorna a representação textual do objeto
	    return name + ", $ " + String.format("%.2f", netSalary()); // Exibe nome e salário líquido formatado com 2 casas decimais
	}
}