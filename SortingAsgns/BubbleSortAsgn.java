package SortingAsgns;

class Tester {
    public static void swap(int[] elements, int firstIndex, int secondIndex) {
		// Implement your logic here
		if(firstIndex >= 0 && firstIndex <elements.length && secondIndex >= 0 && secondIndex < elements.length){
			int temp = elements[firstIndex];
			elements[firstIndex] = elements[secondIndex];
			elements[secondIndex] = temp;
		}
	}

	public static void sortArray(int arr[]) {
		// Implement your logic here
        int len = arr.length;
        boolean swapped = false;
		for(int index1 = 0; index1 < (len-1) ; index1++){
		    for(int index2 = 0; index2 < (len-index1-1); index2++){
		        if(arr[index2] > arr[index2+1]){
		            swap(arr, index2, index2+1);
                    swapped= true;
		        }
		    }
            if(swapped==false){
                break;
            }
		}
	}

	public static int findMaxSum(int arr[], int m) {
		// Implement your logic here and change the return statement accordingly
        int MaxSum=0;
        if(m <arr.length){
            for(int i = (arr.length - 1); i >= (arr.length - m); i--){
                MaxSum += arr[i];
            }
            return MaxSum;
        }
        return 0;
	}

	public static int findMinSum(int arr[], int m) {
		// Implement your logic here and change the return statement accordingly
        int minSum = 0;
        if(m < arr.length){
            for(int i = 0; i < m ; i++){
                minSum += arr[i];
            }
            return minSum;
        }
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		sortArray(arr);
		System.out.println("Maximum Sum for m=4: " + findMaxSum(arr, 4));
		System.out.println("Minimum Sum for m=3: " + findMinSum(arr, 3));
	}

}


