package URI;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri_1178 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> n = new ArrayList<Double>();
		double x = scan.nextDouble();
		for (int i =0; i<100;i++) {
			if(i==0) {
				n.add(x);
			}else {
				n.add(n.get(i-1)/2);
			}
			System.out.println(String.format("N[%d] = %.4f", i,n.get(i) ));
		}
	}
}
