import java.util.ArrayDeque;
import java.util.*;

class Tester {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
		//Implement your logic here and change the return statement accordingly
        Deque<Character> result = new ArrayDeque<Character>();
        Deque<Character> stack = new ArrayDeque<Character>();

        Iterator<Character> it = inputStack.descendingIterator();
        Iterator<Character> it2 = stack.descendingIterator();

        int count = 0;
        while(it.hasNext()){
            if(count < 3)
              stack.push(inputStack.pop());
            else
              result.push(inputStack.pop());
        }
        while(it2.hasNext()){
            result.push(stack.pop());
        }

		return result;
	}
	
	public static void main(String[] args) {
		
		Deque<Character> inputStack = new ArrayDeque<Character>();
		inputStack.push('E');
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A');
		
		Deque<Character> resultStack = updateStack(inputStack);
		
		System.out.println("The alphabets in updated stack are:");
		for(Character alphabet: resultStack)
		    System.out.println(alphabet);
	}
}