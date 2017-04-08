/**
 * 3.2 Stack Min: How would you design a stack which, in addition to push and pop, has a function
 * min which returns the minimum element? Push, pop and min should all operate in 0(1) time.
 * 
 * @author Harsha Dodda
 *
 */

/*
 * 
 * You can have a variable that keeps track of the min number as it gets pushed so the first time
 * we push in we make the min variable equal to the thing and then the next thing we push, we 
 * check if it is smaller than the current min, and if it is we update the min, if it is not, we
 * move on. When we are popping a value, if it is not the min value we pop the value without 
 * changing the min value. If we pop the min value after checking that it is in fact the min 
 * value, we must go through the array/stack to see the next lowest value excluding the value we
 * are popping. This may be O(N) time for this one search, but this will be amortized to become
 * an O(1) overall runtime because we only encounter the O(N) runtime every now and again. This 
 * will be amortized to O(1) time overall. Pop and push are O(1) still.   
 * 
 */
public class CH3_StackMin {

}
