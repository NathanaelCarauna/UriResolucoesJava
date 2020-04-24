package URI;

import java.util.Scanner;

public class Uri_1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double entrada = sc.nextDouble();
		String resposta = "Intervalo ";
		if(entrada>=0 && entrada <=100) {
			if(0<=entrada && entrada<=25) {
				resposta += "[0,25]";
			}
			else if(entrada<=50){
				resposta+="(25,50]";
			}
			else if(entrada<=75) {
				resposta+="(50,75]";
			}
			else if(entrada<=100) {
				resposta+="(75,100]";
			}
			System.out.println(resposta);
		}else {
			System.out.println("Fora de intervalo");
		}
		
	}
}
