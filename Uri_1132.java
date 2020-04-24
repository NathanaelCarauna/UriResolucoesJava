package URI;

import java.util.Scanner;

public class Uri_1132 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt(), y = scanner.nextInt(), soma =0;
		
		if(x>= y) {
			for(int i = y; i<x+1;i++) {
				if(i%13 !=0) {
					soma+=i;
				}
			}
		} else{
			for(int i = x; i<y+1;i++) {
				if(i%13 !=0) {
					soma+=i;
				}
			}
		}
		System.out.println(soma);
		
	}
}
