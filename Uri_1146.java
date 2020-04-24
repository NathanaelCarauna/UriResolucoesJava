package URI;

import java.util.Scanner;

public class Uri_1146 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		
		while((x = scan.nextInt()) != 0) {
			if(x == 0) {
				break;
			}
			for(int i = 1; i<=x; i++) {
				if(i==x) {
					System.out.println(x);
					
				}else {
					System.out.print(i+" ");
				}		
			}
		}
	}
}
