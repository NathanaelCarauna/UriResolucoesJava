package URI;

import java.util.Scanner;

public class Uri_1150 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt(), z, numeros=1, soma = 0;
		
		while (true) {
			z = scan.nextInt();
			if(z>x) {
				break;
			}
		}
		
		while(true){
			soma +=x;
			if(soma >z) {
				break;
			}
			x+=1;
			numeros+=1;
		}
		System.out.println(numeros);
				
	}
}
