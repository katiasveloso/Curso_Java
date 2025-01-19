

package curso_programcao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 32;
		double x = 10.35784;
		System.out.print("Olá mundo!");//print não quebra linha
		System.out.println(y);// println quebra a linha
		System.out.printf("%.2f%n", x); //formação que demilita aparece somente 2 casas após a virgula
        Locale.setDefault(Locale.US); // utilizar ponto na númeração em vez de virgula
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = "+ x + " Metros");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        //%f = ponto flutuante, %d = inteiro, %s = texto, %n = quebra de linha
        
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        
	}

}
