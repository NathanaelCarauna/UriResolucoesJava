package URI;

import java.util.Scanner;

public class Uri_1131 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int empates = 0, interVitorias = 0, gremioVitorias = 0, interGols, gremioGols, continuar = 1, grenais = 0;

		while(continuar ==1) {
			int novoGrenal =-1;
			grenais++;
			interGols = scanner.nextInt();
			gremioGols = scanner.nextInt();
			if(interGols > gremioGols) {
				interVitorias++;
			}else if(interGols == gremioGols) {
				empates++;
			}else {
				gremioVitorias++;
			}
			while(novoGrenal != 1 && novoGrenal != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				novoGrenal = scanner.nextInt();
				if(novoGrenal ==1) {
					continuar =1;
				}else if(novoGrenal ==2){
					continuar =2;
				}
			}

		}
		System.out.println(String.format("%d grenais", grenais));
		System.out.println(String.format("Inter:%d", interVitorias));
		System.out.println(String.format("Gremio:%d", gremioVitorias));
		System.out.println(String.format("Empates:%d", empates));
		if(interVitorias>gremioVitorias) {
			System.out.println("Inter venceu mais");
		}else if(gremioVitorias>interVitorias) {
			System.out.println("Gremio venceu mais");
		}else {
			System.out.println("Nao houve vencedor");
		}
	}
}
