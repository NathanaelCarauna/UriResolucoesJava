package URI;

import java.util.Scanner;

public class Uri_1060 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inteiros = 0;
		
		for(int i = 0; i<6; i++ ) {
			float entrada = sc.nextFloat();
			if(entrada>0) {
				inteiros +=1;
			}
		}
		System.out.println(inteiros + " valores positivos");
	}
}
