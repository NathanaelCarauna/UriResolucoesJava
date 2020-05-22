package URI;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri_1173 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();
		int x = scan.nextInt();
		
		for(int i = 0; i<10; i++) {
			n.add(x);
			x*=2;
			System.out.println("N["+i+"] = " + n.get(i));
		}
	}
}
