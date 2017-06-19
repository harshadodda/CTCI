/**
 * This class implements a queue using two stacks.
 * @author Harsha Dodda
 *
 */
public class QueueStacks {
	Stack s1 = new Stack();
	Stack s2 = new Stack();
	
	/**
	 * This function pushes a value into the running queue which is stack s1.
	 * @param value, the value to be pushed in
	 */
	public void enqueue(int value) {
		s1.push(value);
	}
	
	/**
	 * This function pops the first value in the running queue which is stack s1.
	 * @return, the value that was popped from the queue
	 */
	public int dequeue() {
		int value = 0;
		while(s1.isEmpty() == false) { // empties the queue and puts it into the s2
			int temp = s1.pop();
			s2.push(temp);
		}
		value = s2.pop(); // takes the first value from s2 which would be the value to dequeue
		while(s2.isEmpty() == false) { // re fills the stack s1 which is our running queue in the order they were before the dequeue
			int temp = s2.pop();
			s1.push(temp);
		}
		return value; 
	}
	
	/**
	 * returns the value of the front of the queue.
	 * @return, the value at the front of the queue
	 */
	public int peek() {
		int value = 0;
		value = dequeue(); // take out the top value which is what the peek returns
		while(s1.isEmpty() == false) { // empty the stack that represents the queue
			int temp = s1.pop();
			s2.push(temp);
		}
		enqueue(value); // put the value we peek at back into the queue in its correct position
		while(s2.isEmpty() == false) { // return the rest of the elements into the correct positions in the queue
			int temp = s2.pop();
			s1.push(temp);
		}
		return value;
	}
	
	/**
	 * returns whether the queue is empty or not
	 * @return, true if it is empty, false if not
	 */
	public boolean isEmpty() {
		return s1.isEmpty();
	}
	
	/**
	 * prints the contents of the queue and the helper stack
	 */
	public void print() {
		System.out.print("Contents of s1: ");
		s1.print();
		System.out.print("Contents of s2: ");
		s2.print();
	}
}
