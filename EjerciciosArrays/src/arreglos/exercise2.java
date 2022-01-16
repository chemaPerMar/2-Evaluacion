package arreglos;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {1,2,3,4,5};
		
		for (int i : inverted(numeros)) {
			System.out.println(i);
		}
		
	}
	
	public static int[] inverted(int... numeros) {
		int[] numerosInvertidos = new int[numeros.length];
		
		for(int i = 0;i<numeros.length;i++) {
			numerosInvertidos[i] = numeros[numeros.length - 1 - i];
		}
		return numerosInvertidos;
	}

}
