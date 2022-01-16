package arreglos;

public class exercise5 {

	public static void main(String[] args) {
		
		double[][][] decimales = {
				{ {2.5,4.5},
					{6.5,1.5} },
				
				{ {150.5,422.5},
						{66.5,100.5} }};
		
		System.out.println(mayorNumero(decimales));

	}
	
	public static double mayorNumero(double[][][] decimales) {
		double result = decimales[0][0][0];
		
		for(int i = 0;i<decimales.length;i++) {
			for(int y = 0;y<decimales[i].length;y++)
			{
				for(int z = 0;z<decimales[i][y].length;z++)
				{
					if(result < decimales[i][y][z]) {
						result = decimales[i][y][z];
					}
				}
			}
		}
		
		return result;
	}

}
