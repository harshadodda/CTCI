import java.util.ArrayList;

/**
 * This class implements a data structure that consists of a few stacks, when one stack gets full
 * the next stack is used. The default capacity of the stacks is 3. These stacks are imagined to 
 * be one on top of another such that the current stack is at the top and the oldest stack is at 
 * the bottom.
 * @author Harsha Dodda
 *
 */
public class PlateStack {
	public ArrayList<Stack> stackList = new ArrayList<Stack>();
	public int currentStack = 0;
	
	public void push(int value) {
		Stack stack = stackList.get(this.currentStack);
		if(stack.getNumValues() >= stack.getCapacity()) {
			Stack newStack = new Stack();
			this.stackList.add(newStack);
			newStack.push(value);
			newStack.setNumValues(newStack.getNumValues() + 1);
			this.currentStack++;
		}
		else {
			stack.push(value);
		}
	}
	
	/**
	 * This pops the current stacks top value which is the last value to be put in to any stack.
	 * @return, the value that is popped off of the tallest stack(current stack)
	 */
	public int pop() {
		int value = 0;
		Stack stack = stackList.get(this.currentStack);
		value = stack.pop();
		if(stack.top == -1) {
			this.stackList.remove(stack);
			this.currentStack--;
		}
		return value;
	}
	
	/**
	 * Prints the contents of every stack in order from first to last. Last being the stack that
	 * is the current stack and the stack where the most recent push and pops occur.
	 */
	public void print() {
		for(Stack s : stackList) {
			s.print();
		}
	}
}
