package URI;

import java.util.Scanner;

public class Uri_1115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0, y=0;
		
		while(true) {
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 || y ==0) {
				break;
			}else if(x>0 && y>0) {
				System.out.println("primeiro");
			}else if(x>0 && y<0) {
				System.out.println("quarto");
			}else if(x<0 && y<0) {
				System.out.println("terceiro");
			}else if(x<0 && y>0) {
				System.out.println("segundo");
			}
		}
		
	}
}
