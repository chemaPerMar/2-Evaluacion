package arreglos;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {1,2,3,4,5};
		
		for (int i : inverted(numeros, 0, numeros.length - 1)) {
			System.out.println(i);
		}
	}
	
	public static int[] inverted(int[] numeros, int start, int end) {
	    if (start >= end) { 
	        return numeros;
	    }
	    int temp = numeros[start];
	    numeros[start] = numeros[end];
	    numeros[end] = temp;
	    return inverted(numeros, start + 1, end - 1);
	}

}
