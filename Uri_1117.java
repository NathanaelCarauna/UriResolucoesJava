package URI;

import java.util.Scanner;

public class Uri_1117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1,n2;
		n1 = sc.nextDouble();
		while(n1<0 || n1 >10) {
			System.out.println("nota invalida");
			n1 = sc.nextDouble();
		}
		n2 = sc.nextInt();
		while(n2<0 || n2 >10) {
			System.out.println("nota invalida");
			n2 = sc.nextDouble();
		}
		System.out.println(String.format("media = %.2f", ((n1+n2)/2)));
	}
}
