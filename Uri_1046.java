package URI;

import java.util.Scanner;

public class Uri_1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio = sc.nextInt(), fim = sc.nextInt(), horas;
		String resposta = "O JOGO DUROU %d HORA(S)\n";
		
		if(fim < inicio) {
			fim+= 24;
			horas = fim - inicio;
		}else if(fim> inicio) {
			horas = fim - inicio;
		}else {
			horas = 24;
		}
		
		System.out.printf(resposta, horas);
		
		
	}
}
