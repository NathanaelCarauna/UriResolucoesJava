package URI;

import java.util.Scanner;

public class Uri_1153 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), fatorial = 1;
		
		for(int i = n; i>0; i--) {
			fatorial*=i;
		}
		System.out.println(fatorial);
	}
}
