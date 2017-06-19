import java.util.ArrayList;
/**
 *  This is an iteger stack implementation using an array list underneath
 *  This stack supports the following operations: 
 *  	-add(item) : Add an item to the top of the stack.
 *		-remove() : Remove the top item in the stack.
 *		-peek() : Return the top of the stack.
 *		-isEmpty() : Return true if and only if the stack is empty.
 *
 * @author Harsha Dodda
 *
 */
public class Stack {
	private ArrayList<Integer> stack = new ArrayList<Integer>(); 
	public int top = -1;
	private int numValues = 0; 
	private int capacity = 3;
	
	public int getNumValues() {
		return this.numValues;
	}

	public void setNumValues(int numValues) {
		this.numValues = numValues;
	}
	
	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void push(int value) {
		stack.add(value);
		numValues++;
		top++;
	}
	
	public int pop() {
		int value;
		value = stack.remove(top);
		numValues--;
		top--;
		return value;
	}
	
	public int peek() {
		return stack.get(top);
	}
	
	public boolean isEmpty() {
		return numValues == 0 || top == -1;
	}	
	
	public void print() {
		for(Integer i : stack) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
}
