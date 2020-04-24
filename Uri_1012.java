package URI;

import java.util.Scanner;

public class Uri_1012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a,b,c, triang, circ, trap, quad, ret;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		triang = a*c/2;
		circ = 3.14159* Math.pow(c, 2);
		trap = ((a+b)*c)/2;
		quad = b*b;
		ret = a*b;
		System.out.printf("TRIANGULO: %.3f\n",triang);
		System.out.printf("CIRCULO: %.3f\n",circ);
		System.out.printf("TRAPEZIO: %.3f\n",trap);
		System.out.printf("QUADRADO: %.3f\n", quad);
		System.out.printf("RETANGULO: %.3f\n", ret);
		
				
	}
}
