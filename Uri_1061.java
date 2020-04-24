package URI;

import java.util.Scanner;

public class Uri_1061 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] entrDiaI = sc.nextLine().split(" ");
		String diaIStr = entrDiaI[1];

		String[] entrHoraI = sc.nextLine().split(":");
		String horaIStr = entrHoraI[0];//.strip();
		String minutoIStr = entrHoraI[1];//.strip();
		String segundoIStr = entrHoraI[2];//.strip();

		String[] entrDiaF = sc.nextLine().split(" ");
		String diaFStr = entrDiaF[1];//.strip();

		String[] entrHoraF = sc.nextLine().split(":");
		String horaFStr = entrHoraF[0];//.strip();
		String minutoFStr = entrHoraF[1];//.strip();
		String segundoFStr = entrHoraF[2];//.strip();

		int diaInicial = Integer.parseInt(diaIStr), horaInicial = Integer.parseInt(horaIStr), minutoInicial = Integer.parseInt(minutoIStr),
				segundoInicial = Integer.parseInt(segundoIStr),	diaFinal = Integer.parseInt(diaFStr), horaFinal = Integer.parseInt(horaFStr),
				minutoFinal = Integer.parseInt(minutoFStr), segundoFinal = Integer.parseInt(segundoFStr), dias = 0, horas = 0,
				minutos = 0, segundos = 0;

		horaInicial*=3600;
		minutoInicial *=60;
		horaFinal *=3600;
		minutoFinal *= 60;
		segundoInicial += horaInicial+minutoInicial;
		segundoFinal += horaFinal+minutoFinal;

		if(segundoFinal<segundoInicial) {
			dias+=diaFinal-diaInicial-1;
			segundos = segundoFinal-segundoInicial +(24*60*60);
		}else {
			dias+=diaFinal-diaInicial;
			segundos = segundoFinal-segundoInicial;
		}
		horas = segundos/3600;
		segundos %=3600;
		minutos = segundos/60;
		segundos%=60;

		System.out.printf("%d dia(s)\n", dias);
		System.out.printf("%d hora(s)\n", horas);
		System.out.printf("%d minuto(s)\n", minutos);
		System.out.printf("%d segundo(s)\n", segundos);

	}
}
