package URI;

import java.util.Scanner;

public class Uri_1036 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double a,b,c, r1,r2;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if(a==0 || ((Math.pow(b, 2)-4*a*c)<0)){
			System.out.println("Impossivel calcular");
		}else {
			r1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2.0*a);
			r2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2.0*a);
			System.out.printf("R1 = %.5f\n",r1);
			System.out.printf("R2 = %.5f\n",r2);
		}
	}
}
