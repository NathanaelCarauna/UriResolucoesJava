package URI;

import java.util.Scanner;

public class Uri_1118 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, media;
		int repetirMedia = 1, podeRepetir;
		
		while(repetirMedia == 1) {
			podeRepetir = 0;
			nota1 = sc.nextDouble();
			while(nota1 <0 || nota1>10) {
				System.out.println("nota invalida");
				nota1 = sc.nextDouble();
			}
			nota2 = sc.nextDouble();
			while(nota2 < 0 || nota2 >10) {
				System.out.println("nota invalida");
				nota2 = sc.nextDouble();
			}
			media = (nota1+nota2)/2;
			System.out.println(String.format("media = %.2f", media));
			while(podeRepetir !=1 && podeRepetir !=2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				podeRepetir = sc.nextInt();
				if(podeRepetir == 1) {
					repetirMedia = 1;
				}else if(podeRepetir == 2) {
					repetirMedia = 0;
				}
			}
		}
	}
}
