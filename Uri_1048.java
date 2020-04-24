package URI;

import java.util.Scanner;

public class Uri_1048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble(), novoSalario = 0, reajuste = 0;
		int percentual = 0;
		String rNovoSalario =  "Novo salario: %.2f\n";
		String rReajuste = "Reajuste ganho: %.2f\n";
		String rPercentual = "Em percentual: %d %%\n";
		
		if(salario > 2000) {
			percentual = 4;
			novoSalario = salario+salario*percentual/100;
			reajuste = salario*percentual/100;
		}else if(salario > 1200) {
			percentual = 7;
			novoSalario = salario+salario*percentual/100;
			reajuste = salario*percentual/100;
		}else if(salario > 800) {
			percentual = 10;
			novoSalario = salario+salario*percentual/100;
			reajuste = salario*percentual/100;
		}else if(salario > 400) {
			percentual = 12;
			novoSalario = salario+salario*percentual/100;
			reajuste = salario*percentual/100;
		}else if(salario >= 0) {
			percentual = 15;
			novoSalario = salario+salario*percentual/100;
			reajuste = salario*percentual/100;
		}
		System.out.printf(rNovoSalario, novoSalario);
		System.out.printf(rReajuste, reajuste);
		System.out.printf(rPercentual, percentual);
		
	}
}
