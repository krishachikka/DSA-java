package ComparisonAsgn;

class Tester {

	public static int[][] multiply(int arr1[][],int arr2[][]) {
		//Implement your logic here and change the return statement accordingly
        int row1 = arr1.length;
        int col1 = arr1[0].length;
        int col2 = arr2[0].length;

        if (col1 != arr2.length) {
            return null;
        }

        int[][] result = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return result;
	}
	
	public static void main(String[] args) {
		int arr1[][]=new int [][] {{2,4},{1,4}};
		int arr2[][]=new int [][] {{1,4},{1,3}};
		
		int[][] arr3=multiply(arr1,arr2);
		
		for(int index1=0;index1<arr3.length;index1++){
			for(int index2=0;index2<arr3.length;index2++){
				System.out.print(arr3[index1][index2]+" ");
			}
			System.out.println();
		}
	}
}
