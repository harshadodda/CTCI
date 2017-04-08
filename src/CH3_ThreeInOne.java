/**
 * 3.1 Three in One: Describe how you could use a single array to implement three stacks.
 * 
 * @author Harsha Dodda
 *
 */

/*
 * 
 * Answer:
 * 
 * Each individual stack should have the following variable(s) to keep track of:
 * 		-top : keeps track of the index in the array that is the top of this stack
 * 	
 * 
 * The three stacks should each have the following functions:
 * 		-push(item, stackNumber) : takes in an item and a stack number and pushes the item into the appropriate stack 
 * 		-pop(stackNumber) : removes the top element from the appropriate stack
 * 		-peek(stackNumber) : returns the top element from the appropriate stack without removing it
 * 		-isEmpty(stackNumber) : returns true if the appropriate stack is empty, false if not  
 * 
 * The stacks will be represented as a single array. We start the array at a size of 6 which means 2 slots available 
 * for each stack. We will have three variables, top1, top2, top3 which denote the top of the respective stacks. When
 * we push an item, we see which stack it is being pushed onto and use the top value for that stack to insert the value.
 * When one stack, is full, we double the size of the array and when we transfer what we had in the old array into the new one, 
 * we take the index of the old array and multiply it by 2 and store the value in this new index. Then when we are adding 
 * the value that would have overflowed the stack we can now increment the top of the respective stack and add the number in.
 * 
 * To pop we just make the value of the top of the respective stack 0 and decrement the top value. 
 * 
 * To peek, we just return the value of the index of the top of the respective stack.
 * 
 * To check if it is empty, we take the size of the array, and we divide by 3 to get the size of each individual stack call it stackSize. Then
 * we check the index of the (stackSize * the number of the stack - 1) so, if the number of the stack is 1, we use 0 and if the number of the 
 * stack is 2, we use (stackSize * 1), etc. For example if the stack size is 2 and we want to check if the index 0 of the array has a value in it
 * that we care about, i.e. isnt a value that we define is the dummy value, it is not empty. To check if stack 2 is empty, we do the same, we 
 * check if index 6 is empty. 
 * 
 * If we maintain the properties correctly and adjust the values correctly we can maintain the stacks properly. 
 * 
 */

public class CH3_ThreeInOne {

}
