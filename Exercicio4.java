package exerciciosMatriz;

public class Exercicio4 {

	public static void main(String[] args) {
		char A[][] = {
				{'a','b','c','d','e'},
				{'f','g','h','i','j'},
				{'k','l','m','n','o'},
				{'p','q','r','s','t'}
		};
		for(char[]letra:A) {
			for(char coluna: letra) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
	}
}
