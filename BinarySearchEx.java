class BinarySearchEx{
    
    public static int iterations=0;
	
	public static int searchElement(int elements[],int low,int high,int elementToBeSearched)  {
		//Implement your logic here and change the return statement accordingly
		int mid = low + (high-low)/2;
		while(low<high){
			iterations++;
			if(elements[mid]== elementToBeSearched){
				return mid+1;
			}
			if(elements[mid] > elementToBeSearched){
				high=mid-1;
			}
			if(elements[mid]< elementToBeSearched){
				low=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
	    int[] elements = { 1, 23, 43, 46, 78, 90 };
		int elementToBeSearched = 43;
		
		int indexPosition=searchElement(elements, 0, elements.length-1, elementToBeSearched);
		
		if (indexPosition == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found at index position " + indexPosition+"!");
		
		System.out.println("Number of iterations: "+iterations);
	}

	
}