class Tester {
	
	public static int searchElement(int[] elements, int elementToBeSearched) {
		//Implement your logic here and change the return statement accordingly
        int n = elements.length;
        for (int i = 0; i < n; i++) {
            if( elements[i] == elementToBeSearched)
               return i+1;
            return -1;
        }
		return 0;
	}
	
	public static void main(String[] args) {
		int[] elements = { 76, 24, 78, 98, 1 };
		int elementToBeSearched = 78;
		
		int numberOfIterations = searchElement(elements, elementToBeSearched);
		
		if (numberOfIterations == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found! Number of iterations required to find the element : " + numberOfIterations);
	}
	
}