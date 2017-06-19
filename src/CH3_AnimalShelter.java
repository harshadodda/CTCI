/**
 * This program runs the solution for the problem (3.6) Animal Shelter in CTCI
 * This program uses the helper classes AnimalList and AnimalNode
 * @author Harsha Dodda
 *
 */
public class CH3_AnimalShelter {

	public static void main(String[] args) {
		AnimalList shelterList = new AnimalList();
		shelterList.enqueue("dog");
		shelterList.enqueue("cat");
		shelterList.enqueue("cat");
		shelterList.enqueue("dog");
		
		shelterList.print();
		
		shelterList.dequeueCat();
		shelterList.print();
		shelterList.dequeueAny();
		shelterList.print();
		shelterList.dequeueDog();
		shelterList.print();
		shelterList.dequeueDog();
		shelterList.enqueue("cat");
		shelterList.print();
	}

}
