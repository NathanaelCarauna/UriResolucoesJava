package URI;

import java.util.Scanner;

public class Uri_1010 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cod1 = scan.nextInt(), qtd1 = scan.nextInt();
		double vUnit1 = scan.nextFloat();
		int cod2 = scan.nextInt(), qtd2 = scan.nextInt();
		double vUnit2 = scan.nextDouble(),
				total = (vUnit1*qtd1)+(vUnit2*qtd2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
	}
}
