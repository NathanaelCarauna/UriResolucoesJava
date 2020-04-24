package URI;

import java.util.Scanner;

public class Uri_1114 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String senha = "";
		
		while(!(senha.equals("2002"))){
			senha = scanner.next();
			if(senha.equals("2002")) {
				System.out.println("Acesso Permitido");
			}else {
				System.out.println("Senha Invalida");
			}
		}
	}
}
