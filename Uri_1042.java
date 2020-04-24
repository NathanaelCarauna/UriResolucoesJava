package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Uri_1042 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> entrada = new ArrayList<Integer>();
		int a, b, c, temp;
		entrada.add(sc.nextInt());
		entrada.add(sc.nextInt());
		entrada.add(sc.nextInt());
		a = entrada.get(0);
		b = entrada.get(1);
		c = entrada.get(2);

		Collections.sort(entrada);
		
		System.out.println(entrada.get(0));
		System.out.println(entrada.get(1));
		System.out.println(entrada.get(2));
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}
