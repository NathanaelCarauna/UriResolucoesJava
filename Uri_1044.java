package URI;

import java.util.Scanner;

public class Uri_1044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();

		if(a<=b) {
			if(b%a ==0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}
		}else if(a>b) {
			if(a%b ==0) {
				System.out.println("Sao Multiplos");	
			}else {
				System.out.println("Nao sao Multiplos");
			}

		}
	}
}