package URI;

import java.util.Scanner;

public class Uri_1064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inteiros = 0;
		double media = 0, soma = 0;
		
		for (int i = 0; i<6; i++) {
			float entrada = sc.nextFloat();
			if(entrada > 0) {
				soma  += entrada;
				inteiros +=1;
			}
		}
		media = soma/inteiros;
		System.out.println(inteiros + " valores positivos");
		System.out.println(String.format("%.1f", media));
	}
}
