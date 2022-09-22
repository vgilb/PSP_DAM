package repaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int factorial = 1;

		System.out.print("Introduce nº: ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = num; i > 0; i--) {
				factorial = factorial * i;
			}
		}

		System.out.println("factorial: " + factorial);
	}

}
