package URI;

import java.util.Scanner;

public class Uri_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i<=n; i++) {
			if(n%i ==0) {
				System.out.println(i);
			}
		}
	}

}
