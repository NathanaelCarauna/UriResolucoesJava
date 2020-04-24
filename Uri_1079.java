package URI;

import java.util.Scanner;

public class Uri_1079 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		double a, b ,c ,mediaP;
		
		for(int i = 0; i<t; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			mediaP = (a*2+b*3+c*5)/10;
			System.out.println(String.format("%.1f", mediaP));
		}
	}
}
