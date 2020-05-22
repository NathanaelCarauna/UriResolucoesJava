package URI;

import java.util.Scanner;

public class Uri_1165 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nCasos = scan.nextInt(), nDivisores;
		
		for(int i = 0; i<nCasos; i++) {
			int x = scan.nextInt();
			nDivisores = 0;
			for(int j = 1; j<=x ; j++) {
				if(x%j == 0) {
					nDivisores+=1;
				}
			}
			if(nDivisores > 2) {
				System.out.println(x + " nao eh primo");
			}else {
				System.out.println(x + " eh primo");
			}
		}
	}
}
