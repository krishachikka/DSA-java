package SortingAsgns;

// import javax.print.attribute.standard.Media;

class Tester {
	
	public static void mergeSort(int[] elements, int size) {
		//Implement your logic here
        if (size < 2)
        return;

        int mid = size / 2; 
        int[] left = new int[mid];
        int[] right = new int[size - mid]; 

        for (int index = 0; index < mid; index++)
            left[index] = elements[index];

        for (int index = mid; index < size; index++)
            right[index - mid] = elements[index];

        mergeSort(left, mid);

        mergeSort(right, size - mid);

        merge(elements, left, right, mid, size - mid);
	}

	public static void merge(int[] elements, int left[], int right[], int leftMerge, int rightMerge) {
        //Implement your logic here
        int firstIndex = 0; 
		int secondIndex = 0; 
		int thirdIndex = 0; 

		while (firstIndex < leftMerge && secondIndex < rightMerge) {
			if (left[firstIndex] <= right[secondIndex])
				elements[thirdIndex++] = left[firstIndex++];
			else
				elements[thirdIndex++] = right[secondIndex++];
		}

		while (firstIndex < leftMerge)
			elements[thirdIndex++] = left[firstIndex++];

		while (secondIndex < rightMerge)
			elements[thirdIndex++] = right[secondIndex++];
	}
	
	public static double findMedian(int elements[]) {
		//Implement your logic here and change the return statement accordingly
        int n = elements.length;
        double median;
        if (n % 2 == 0) {
            int mid = n / 2;
            median = (elements[mid - 1] + elements[mid]) / 2.0;
        } 
        else {
            int mid = n / 2;
            median = elements[mid];
        }
        return median;
	}

	public static void main(String[] args) {
		int elements[] = { 64, 34, 25, 12, 22, 11, 90 }; 
        mergeSort(elements, elements.length); 
        System.out.println("Median: "+findMedian(elements)); 
	}
}

