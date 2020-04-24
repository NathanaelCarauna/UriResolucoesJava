package URI;

import java.util.Scanner;

public class Uri_1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), qtd, tCoelhos = 0, tSapos = 0, tRatos = 0, total = 0;
		String cobaia;
		for(int i = 0; i<t; i++) {
			qtd = sc.nextInt();
			cobaia = sc.next();
			
			if(cobaia.equals("C")) {
				tCoelhos += qtd;
			}
			else if (cobaia.equals("S")) {
				tSapos +=qtd;
			}
			else if(cobaia.equals("R")) {
				tRatos +=qtd;
			}
			total +=qtd;
		}
		System.out.println(String.format("Total: %d cobaias" , total));
		System.out.println(String.format("Total de coelhos: %d", tCoelhos));
		System.out.println(String.format("Total de ratos: %d", tRatos));
		System.out.println(String.format("Total de sapos: %d", tSapos));
		System.out.println(String.format("Percentual de coelhos: %.2f %%", ((tCoelhos/(float)total)*100)));
		System.out.println(String.format("Percentual de ratos: %.2f %%", ((tRatos/(float)total)*100)));
		System.out.println(String.format("Percentual de sapos: %.2f %%", ((tSapos/(float)total)*100)));
	}
}
