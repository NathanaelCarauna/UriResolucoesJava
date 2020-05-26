package URI;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri_1177 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();
		int t = scan.nextInt();
		for(int i = 0; i<1000;i++) {
			for(int j =0;j<t;j++) {
				n.add(j);
			}
			System.out.println("N["+i+"] = " + n.get(i));
		}
	}
}
