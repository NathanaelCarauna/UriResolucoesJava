package URI;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri_1172 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		for(int i = 0; i< 10; i++) {
			x.add(scan.nextInt());
			if(x.get(i) <=0) {
				x.set(i, 1);
			}
			System.out.println("X["+i+"] = " + x.get(i));
		}
		
	}
}
