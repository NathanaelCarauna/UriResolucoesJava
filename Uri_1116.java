package URI;

import java.util.Scanner;

public class Uri_1116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0, y = 0;
		double divisao;
		
		int t = sc.nextInt();
		for(int i = 0; i<t;i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if(y!=0) {
				System.out.println(String.format("%.1f", ((double)x/y)));
			}else {
				System.out.println("divisao impossivel");
			}
		}
 	}
}
