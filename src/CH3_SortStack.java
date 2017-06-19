/**
 * 
 * 3.5 Sort Stack: Write a program to sort a stack such that the smallest items are on the top. 
 * You can use an additional temporary stack, but you may not copy the elements into any other 
 * data structure (such as an array). The stack supports the following operations: push, pop, 
 * peek, and isEmpty.
 * 
 * @author Harsha Dodda
 *
 */
public class CH3_SortStack {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		Stack sorted = new Stack();
		Stack reversedStack = new Stack();
		
		s1.push(1);
		s1.push(5);
		s1.push(3);
		s1.push(6);
		s1.push(4);
		
		System.out.println("Here is the unsorted stack:");
		s1.print();
		
		sorted = sortStack(s1, s2);
		reversedStack = reverseStack(sorted);
		
		System.out.println("Here is the sorted stack(the last element is the on to be popped first):");
		reversedStack.print();
	}
	
	public static Stack sortStack(Stack s1, Stack s2) {
		int value = -1;
		int temp = -1;
		
		while(value == -1) { // this effectively tanslates to while the stack temp stack, s1, is not empty
			value = s1.pop();
			if(s2.isEmpty()) { // if the result stack is empty, push the value in
				s2.push(value);
			}
			else if(value > s2.peek()) { // if the value already in the result stack is lower than the popped
															// value from the temp stack, push the value in
				s2.push(value);
			}
			else if(value < s2.peek()) { // if the value already in the result stack is higher than the popped
															// value form the temp stack
				while(value < s2.peek()) {
					temp = s2.pop(); // pop the value on the result stack
					s1.push(temp); // push it into the temp stack
					if(s2.isEmpty()) { // if the result stack is empty, break
						break;
					}
				}
				s2.push(value); // push the value popped from the temp stack into the result stack, then the 
				// algorithm automatically re-insterts the values we put into the temp stack back to the 
				// result stack, in the correct order
				value = -1; 
			}
			value = -1;
			if(s1.isEmpty()) {
				value = 0; 
			}
		}
		return s2;
	}
	
	/**
	 * Reverses the order of a stack
	 * @param s1, the stack to reverse
	 * @return, the reversed stack
	 */
	public static Stack reverseStack(Stack s1) {
		Stack retStack = new Stack();
		int value = 0;
		while(!s1.isEmpty()) {
			value = s1.pop();
			retStack.push(value);
		}
		return retStack;
	}
}
