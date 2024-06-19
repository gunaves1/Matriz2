package exerciciosMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int par;
		int m [][] = new int [5][5];

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				par = (int)Math.round(Math.random()*100);
				if (par%2 ==0) {
					m[i][j] = par;
					System.out.println("A matriz par é " + par);
				}
			}
		}
		ler.close();
	}
}
