package URI;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri_1176 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Long> fib = new ArrayList<Long>();
		fib.add(0l);
		fib.add(1l);

		for(int i = 0; i<59; i++) {
			fib.add(fib.get(fib.size()-1) + fib.get(fib.size()-2));
		}
		int nTestes = scan.nextInt();
		for(int i = 0; i< nTestes;i++) {
			int x = scan.nextInt();
			System.out.println("Fib("+x+") = " + fib.get(x));
		}
	}
}
