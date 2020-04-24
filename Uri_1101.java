package URI;

import java.util.Scanner;

public class Uri_1101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,soma;
		while(true) {
			x = sc.nextInt(); 
			y = sc.nextInt();
			soma = 0;
			if (x <= 0 || y <= 0) {
				break;
			}

			if (x<=y) {
				for(int i =x; i <y+1;i++) {
					soma+=i;
					System.out.printf(i+" ");
				}		            
				System.out.println("Sum="+ soma);
			}else if (x>y) {
				for(int i = y; i <x+1;i++) {
					soma+=i;
					System.out.printf(i+" ");
				}
				System.out.println("Sum="+ soma);	
			}
		}
	}
}
