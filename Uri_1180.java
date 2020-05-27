package URI;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri_1180 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList<Integer>();
		int n = scan.nextInt(), menorValor = 100000, posicao = 0;
		for(int i = 0; i<n;i++) {
			x.add(scan.nextInt());
		}
		for(int i = 0; i< x.size();i++) {
			if(x.get(i) < menorValor) {
				menorValor = x.get(i);
				posicao = i;
			}
		}
		System.out.println("Menor valor: " + menorValor);
		System.out.println("Posicao: " + posicao);
		
	}
}
