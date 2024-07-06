class Tester {
	static int noOfSwaps = 0;
	static int noOfPasses = 0;

	public static void swap(int[] elements, int firstIndex, int secondIndex) {
		// Implement your logic here
		if(firstIndex >= 0 && firstIndex <elements.length && secondIndex >= 0 && secondIndex < elements.length){
			int temp = elements[firstIndex];
			elements[firstIndex] = elements[secondIndex];
			elements[secondIndex] = temp;
			noOfSwaps++;
		}
	}

	public static int bubbleSort(int[] elements) {
		// Implement your logic here and change the return statement accordingly
		int len = elements.length;
        boolean swapped = false;
		for(int index1 = 0; index1 < (len-1) ; index1++){
		    noOfPasses++;
		    for(int index2 = 0; index2 < (len-index1-1); index2++){
		        if(elements[index2] > elements[index2+1]){
		            swap(elements, index2, index2+1);
                    swapped= true;
		        }
		    }
            if(swapped==false){
                break;
            }
		}
		return noOfPasses;
	}

	public static void displayArray(int[] elements) {
		for (int element : elements)
			System.out.print(element + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int[] elements = { 23, 67, 45, 76, 34, 68, 90 };

		System.out.println("Given array:");
		displayArray(elements);

		int noOfPasses = bubbleSort(elements);

		System.out.println("==========================");
		System.out.println("Total number of passes needed to sort the array: " + noOfPasses);
		System.out.println("==========================");

		System.out.println("Array after sorting:");
		displayArray(elements);

	}
}