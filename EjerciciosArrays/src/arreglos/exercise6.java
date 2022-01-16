package arreglos;

import java.util.Arrays;

public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numeros = {{1, 2},{3, 4, 6, 5},{5, 6, 7}};
		int[][] copia = dobleCopia(numeros);
		
		for(int i = 0;i<copia.length;i++) {
			for (int is : copia[i]) {
				System.out.print(is + " ");
			}
			System.out.println("\n");
		}
	}
	
	public static int[][] dobleCopia(int[][] numeros) {
		int[][] copia = new int[numeros.length][];
		
		for(int i=0;i<numeros.length;i++) 
		{
			copia[i] = Arrays.copyOf(numeros[i], numeros[i].length * 2);
		}
		
		return copia;
	}

}
