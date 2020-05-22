package URI;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri_1174 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Float> n = new ArrayList<Float>();
		
		for(int i = 0;i<100;i++) {
			n.add(scan.nextFloat());
			if(n.get(i)<=10) {
				System.out.println("A["+i+"] = " + n.get(i));
			}
		}
	}
}
