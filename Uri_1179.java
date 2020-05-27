package URI;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri_1179 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();
		
		for(int i = 0; i<15;i++) {
			int x = scan.nextInt();
			if(x % 2 ==0) {
				par.add(x);
				if(par.size() == 5) {
					for(int j =0;j<par.size();j++) {
						System.out.println(String.format("par[%d] = %d", j, par.get(j)));						
					}
					par.clear();
				}
			}else {
				impar.add(x);
				if(impar.size() == 5) {
					for(int j =0;j<impar.size();j++) {
						System.out.println(String.format("impar[%d] = %d", j, impar.get(j)));						
					}
					impar.clear();
				}
			}
		}
		for(int j =0;j<impar.size();j++) {
			System.out.println(String.format("impar[%d] = %d", j, impar.get(j)));						
		}
		for(int j =0;j<par.size();j++) {
			System.out.println(String.format("par[%d] = %d", j, par.get(j)));						
		}
	}
}
