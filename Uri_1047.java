package URI;

import java.util.Scanner;

public class Uri_1047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial = sc.nextInt(), minInicial=sc.nextInt(), horaFinal=sc.nextInt(), minFinal=sc.nextInt(), 
				tempoFinal = (horaFinal*60+minFinal),tempoInicial = ( horaInicial*60 + minInicial), horas = 0,minutos = 0;

		if(tempoFinal<tempoInicial) {
			tempoFinal += (24*60);
			horas = (tempoFinal - tempoInicial)/60;
			minutos = (tempoFinal - tempoInicial)%60;
		}else if(tempoFinal > tempoInicial) {
			if(tempoFinal- tempoInicial < 60) {
				horas = 0;
				minutos = tempoFinal - tempoInicial;
			}
			else {
				horas = (tempoFinal - tempoInicial)/60;
				minutos = (tempoFinal - tempoInicial)%60;
			}
		}else if(tempoFinal == tempoInicial) {
			horas = 24;
			minutos = 0;
		}
		System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
	}
}
