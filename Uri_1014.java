package URI;

import java.util.Scanner;
public class Uri_1014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int km;
		double gasto, consumo;
		km = sc.nextInt();
		gasto = sc.nextDouble();
		consumo = km/gasto;
		System.out.printf("%.3f km/l\n", consumo);
		
	}
}
