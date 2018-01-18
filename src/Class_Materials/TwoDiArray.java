package Class_Materials;

public class TwoDiArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
			// Create 2-dimensional array.
			  int[][] twoD = new int[4][4];

			  // Assign three elements in it.
			  twoD[0][0] = 1;
			  twoD[0][1] = 2;
			  twoD[0][2] = 3;
			  twoD[0][3] = 4;
			  twoD[1][0] = 5;
			  twoD[1][1] = 6;
			  twoD[1][2] = 7;
			  twoD[1][3] = 8;
			  for(int j=0;j<1;j++)
			  {
				  
			  for (int i=0;i<4;i++)
			  {
			  System.out.print(" "+twoD[j][i]);
			  }
			  System.out.println("");
			  
			  }

	}

}
