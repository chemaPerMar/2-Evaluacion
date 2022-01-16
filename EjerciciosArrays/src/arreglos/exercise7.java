package arreglos;

import java.util.Arrays;

public class exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {
				{1,2,3,4},
				{2,5,6,7},
				{3,6,8,9},
				{4,7,9,10}};
		
		int[][] matriz2 = {
				{1,2},
				{2,4},
				{3,4}};
		
		System.out.println("Matriz simetrica: " + esSimetrico(matriz));
		System.out.println("Matriz2 simetrica: " + esSimetrico(matriz2));
	}
	
	public static boolean esSimetrico(int[][] matriz) {
		int[][] copia = new int[matriz.length][matriz.length];
		
		//Bucle que comprueba si un array es cuadrado o no
		for(int i = 0; i< matriz.length; i++)
		{
			if(matriz.length != matriz[i].length)
			{
				throw new RuntimeException("El array no es cuadrado");
			}
		}
		
		for(int i = 0;i<matriz.length;i++)
		{
			for(int y = 0;y<matriz.length;y++) {
				copia[i][y] = matriz[y][i];
			}
		}
		
		return Arrays.deepEquals(matriz, copia);
	}

}
