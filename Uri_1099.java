package URI;

import java.util.Scanner;

public class Uri_1099 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), x,y, soma;
		
		for(int i = 0; i<t; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			soma = 0;
			if(x>y) {
				for(int j = x-1; j>y;j--) {
					if(j%2!=0) {
						soma+=j;
					}
				}
			}
			if(x<y) {
				for(int j = x+1; j<y;j++) {
					if(j%2!=0) {
						soma+=j;
					}
				}
			}
			System.out.println(soma);
			
		}
	}
}
