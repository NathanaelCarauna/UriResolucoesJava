package URI;

import java.util.Scanner;

public class Uri_1013 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a,b,c;
	double m1,m2;
	a = scan.nextInt();
	b = scan.nextInt();
	c = scan.nextInt();
	m1 = (a+b+Math.abs(a-b))/2;
	m2 = (m1+c+Math.abs(m1-c))/2;
	System.out.printf("%.0f eh o maior\n",m2);
}
}
