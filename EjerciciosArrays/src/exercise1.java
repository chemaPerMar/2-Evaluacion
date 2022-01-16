package ejerciciosArray;

public class exercise1 {

	public static void main(String[] args) {
		int [] numeros = {1,2,3,4,5};
		
		System.out.println(productoArray(numeros));

	}
	
	public static int productoArray(int... numeros) {
		int result = 1;
		for (int i : numeros) {
			result *= i;
		}
		
		return result;
	}

}
