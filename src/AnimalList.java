import java.util.LinkedList;

/**
 * Helper class for CH3_AnimalShelter. Implements the animal shelter linked list queue.
 * @author Harsha Dodda
 *
 */
public class AnimalList {
	int count = 0;
	LinkedList<AnimalNode> animalList = new LinkedList<AnimalNode>();
	
	/**
	 * Takes in the type of animal to add, and adds it into the shelter linked list
	 * @param type, the type of animal to add
	 */
	public void enqueue(String type) {
		count++; // generate the unique id for the animal
		AnimalNode newAnimal = new AnimalNode(count, type);
		animalList.add(newAnimal);
	}
	
	/**
	 * takes out the first animal in the list, aka the oldest animal, for adoption
	 * @return, the animal to be adopted
	 */
	public AnimalNode dequeueAny() {
		AnimalNode retAnimal = null;
		retAnimal = animalList.removeFirst();
		System.out.println("Someone adopted a " + retAnimal.type + "\n");
		return retAnimal; 
	}
	
	/**
	 * takes out the first dog in the list, aka the oldest animal, for adoption
	 * @return, the dog to be adopted
	 */
	public AnimalNode dequeueDog() {
		AnimalNode retAnimal = null;
		for(int i = 0; i < animalList.size(); i++) {
			AnimalNode temp = animalList.get(i);  // gets a reference to the animal, does not remove it
			if(temp.type.equals("dog")) {
				retAnimal = animalList.remove(i); // remove it if it is a dog
				System.out.println("Someone adopted a " + retAnimal.type + "\n");
			}
		}
		return retAnimal;
	}
	
	/**
	 * takes out the first cat in the list, aka the oldest animal, for adoption
	 * @return, the cat to be adopted
	 */
	public AnimalNode dequeueCat() {
		AnimalNode retAnimal = null;
		for(int i = 0; i < animalList.size(); i++) {
			AnimalNode temp = animalList.get(i); // gets a reference to the animal, does not remove it
			if(temp.type.equals("cat")) { 
				retAnimal = animalList.remove(i); // remove it if it is a cat
				System.out.println("Someone adopted a " + retAnimal.type + "\n");
			}
		}
		return retAnimal;
	}
	
	/**
	 * prints the animals in the shelter in order from oldest to newest
	 */
	public void print() {
		System.out.println("List of animnals in the shelter:");
		for(AnimalNode animal : animalList) {
			System.out.printf("id:" + animal.id + ", type:" + animal.type + "\n");
		}
		System.out.println();
	}
}
