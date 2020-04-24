package URI;

import java.util.Scanner;

public class Uri_1049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada1 = sc.next(), entrada2 = sc.next(), entrada3 = sc.next(), resposta = "";

		if(entrada1.contentEquals("vertebrado")) {
			if(entrada2.contentEquals("ave")) {
				if(entrada3.contentEquals("carnivoro")) {
					resposta = "aguia";
				}else if(entrada3.contentEquals("onivoro")) {
					resposta = "pomba";
				}

			}else if(entrada2.contentEquals("mamifero")) {
				if(entrada3.contentEquals("onivoro")) {
					resposta = "homem";
				}else if(entrada3.contentEquals("herbivoro")) {
					resposta = "vaca";
				}
			}
		}else if(entrada1.contentEquals("invertebrado")) {
			if(entrada2.contentEquals("inseto")) {
				if(entrada3.contentEquals("hematofago")) {
					resposta = "pulga";
				}else if(entrada3.contentEquals("herbivoro")) {
					resposta = "lagarta";
				}

			}else if(entrada2.contentEquals("anelideo")) {
				if(entrada3.contentEquals("hematofago")) {
					resposta = "sanguessuga";
				}else if(entrada3.contentEquals("onivoro")) {
					resposta = "minhoca";
				}
			}


		}
		System.out.println(resposta);
	}
}
