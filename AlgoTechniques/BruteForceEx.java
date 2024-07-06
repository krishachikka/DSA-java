package AlgoTechniques;

class Tester {
	 
	public static int calculatePower(int num, int p) {
        //Implement your logic here and change the return statement accordingly
        int ans = 1;
        for(int i = 1; i <= p; i++){
            ans *= num;
        }
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(calculatePower(2,5));
	}
}
