import java.util.ArrayList;

/**
 * This program runs the solution for the problem (3.3) Stack of Plates in CTCI
 * This program uses the helper class PlateStack. 
 * @author Harsha Dodda
 *
 */
public class CH3_StackOfPlates {
	
	public static void main(String[] args) {
		PlateStack ps = new PlateStack();
		Stack stack1 = new Stack();
		ps.stackList.add(stack1);
		ps.push(2);
		System.out.println("cs:" + ps.currentStack);
		ps.push(3);
		System.out.println("cs:" + ps.currentStack);
		ps.push(4);
		System.out.println("cs:" + ps.currentStack);
		ps.push(5);
		
		ps.print();
		System.out.println("cs:" + ps.currentStack);
		
		int val;
		val = ps.pop();
		System.out.println(val);
		System.out.println("cs:" + ps.currentStack);
		val = ps.pop();
		System.out.println(val);
		System.out.println("cs:" + ps.currentStack);
		val = ps.pop();
		System.out.println(val);
		System.out.println("cs:" + ps.currentStack);
		
		System.out.println(ps.currentStack);
	}
}
