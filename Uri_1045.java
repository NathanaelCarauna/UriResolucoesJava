package URI;

import java.util.Scanner;

public class Uri_1045 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat(), b = sc.nextFloat(), c = sc.nextFloat();
		
		float A = Math.max(a, Math.max(b, c));
		float B = 0;
		float C = 0;
		
		if(A == a) {
			B = Math.max(b, c);
			C = Math.min(b, c);
		}
		if(A == b) {
			B = Math.max(a, c);
			C = Math.min(a, c);
		}
		if(A == c) {
			B = Math.max(a, b);
			C = Math.min(a, b);
		}
	
		if(A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			if(A*A == B*B + C*C) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if(A*A > B*B + C*C) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if(A*A < B*B + C*C) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(A==B && A==C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if((A==B && A != C) || (A==C && A !=B) || (B==C && B!= A)){
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}
}
