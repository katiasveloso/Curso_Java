package curso_programcao;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		x = sc.next();
		System.out.println("Você digitou:" + x);
		
		sc.close();

	}

}
