package URI;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri_1175 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();
		
		for(int i = 0; i <20; i++) {
			n.add(scan.nextInt());
		}
		
		int indexFinal = n.size()-1;
		
		for(int i = 0; i < n.size()/2; i++) {
			int aux = n.get(i);
			n.set(i, n.get(indexFinal));
			n.set(indexFinal, aux);
			indexFinal--;
		}
		for(int i = 0; i<n.size();i++) {
			System.out.println("N["+i+"] = " + n.get(i));
		}
	}
}
