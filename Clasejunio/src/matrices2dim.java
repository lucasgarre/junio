
public class matrices2dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Inicilizamos la mátriz de dimensiones de
		 * 3 filas y cuatro columnas, primer valor
		 * indica las filas y el segundo valor
		 * indica las columnas
		 */
		//int[][] mat = new int[3][4];
		
		int [][] b ={  {1,2,3,4},
						{5,7,10,15},
						{36,55,74,14}};
		
		int num=0;
		
		for (int i = 0; i <  b.length; i++) {  //filas   (i)
		
			for (int j = 0; j <  b[i].length; j++) {//columnas   (j)
				num =  b[i][j];
				System.out.println(num);
			}
		}

	}

}
