package curso_programcao;

import java.util.Scanner;

public class scanner_inteiro {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		System.out.println("Você digitou:" + x);
		
		sc.close();

	}

}
