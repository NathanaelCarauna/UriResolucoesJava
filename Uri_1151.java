package URI;

import java.util.Scanner;

public class Uri_1151 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(), a = 0, b = 1, c = a+b;
		String sequencia = "";
		
		if(x == 1) {
			sequencia = ""+a;
		}if(x == 2) {
			sequencia = a + " " + b;
		}if(x == 3) {
			sequencia = a + " " + b + " " +c;
		}
		if(x>3) {
			sequencia = a + " " + b + " " +c;
			for(int i =0;i<x-3;i++) {
				a = b;
				b = c;
				c = a +b;
				sequencia+= " "+c;
			}
		}
		System.out.println(sequencia);
		
	}
}
