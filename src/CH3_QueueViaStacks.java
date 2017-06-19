/**
 * This program runs the solution for the problem (3.4) Queue via Stacks in CTCI
 * This program uses the helper class QueueStacks.
 * @author Harsha Dodda
 *
 */
public class CH3_QueueViaStacks {
	
	public static void main(String[] args) {
		QueueStacks qs = new QueueStacks();
		qs.enqueue(1);
		qs.enqueue(5);
		qs.enqueue(2);
		qs.enqueue(3);
		int value = qs.dequeue();
		int peek = qs.peek();
		boolean isEmpty = qs.isEmpty();
		
		qs.print();
		System.out.println(value);
		System.out.println(peek);
		System.out.println(isEmpty);
		
	}
}
