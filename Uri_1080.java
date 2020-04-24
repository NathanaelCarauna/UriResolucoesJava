package URI;

import java.util.Scanner;

public class Uri_1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x = 0 , posicao = 0;
		
		for(int i = 1; i<101; i++) {
			n = sc.nextInt();
			if(n>x) {
				x = n;
				posicao = i;
			}
		}
		System.out.println(x);
		System.out.println(posicao);
	}
}
