package URI;

import java.util.Scanner;

public class Uri_1043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a, b ,c;
		double area, perimetro;
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		if((Math.abs(a-b)<c && c< (a+b)) && (Math.abs(b-c)<a && a< (b+c)) && (Math.abs(a-c)<b && b< (a+c))) {
			perimetro = a+b+c;
			System.out.printf("Perimetro = %.1f\n",perimetro);
		}else {
			area = ((a+b)*c)/2;
			System.out.printf("Area = %.1f\n", area);
		}
			
		
	}
}
