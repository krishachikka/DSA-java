package AlgoTechniques;

class Tester {

	public static int findMaxActivities(int start[], int finish[]) { 
        //Implement your logic here and change the return statement accordingly
        int n = start.length;
        int count = 1;
        int lastAct = 0;
        for(int i = 0; i < n ; i ++){
            if(start[i] >= finish[lastAct]){
                count++;
                lastAct = i;
            }
        }
		return count;
	} 
	       
	public static void main(String[] args) { 
        int start[] =  {1, 3, 0, 5, 8, 5}; 
    	int finish[] =  {2, 4, 6, 7, 9, 9};
    	    
    	System.out.println("Maximum number of activities: "+findMaxActivities(start, finish)); 
    }
}

