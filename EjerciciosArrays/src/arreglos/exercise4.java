package arreglos;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = { 
				{1,2,3}, 
				{4,5,6},
				{7,8,9}};
		
		int[][] resultado = suma(matriz);
		
		String[] palabras = {"fila","columna"};
		
		//Iterando el array
		for(int i=0;i<resultado.length;i++) {
			System.out.println("Suma por " + palabras[i]);
			for(int y=0;y<resultado[i].length;y++) {
				System.out.println(resultado[i][y]);
			}
		}
	}
	
	public static int[][] suma(int[][] matriz) {
		int[][] result = new int[2][matriz.length];
		//Bucle que comprueba si un array es cuadrado o no
		for(int i = 0; i< matriz.length; i++)
		{
			if(matriz.length != matriz[i].length)
			{
				throw new RuntimeException("El array no es cuadrado");
			}
		}
		
		for(int i=0;i<matriz.length;i++) {
			for(int y=0;y<matriz.length;y++) {
				result[0][i] += matriz[i][y]; //suma de la fila
				result[1][i] += matriz[y][i]; //suma de la columna
			}
		}
		
		return result;
	}

}


