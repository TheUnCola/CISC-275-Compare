import java.util.ArrayList;
import java.util.Collection;

public class Dog extends Animal {
	static AnimalCompare ac = null;
	
	public Dog(String n, int l) {
		this.name = n;
		this.legs = l;
	}
	
	@Override
	public String toString() {
		return (this.name + ": " + this.legs);
	}
	
	public static void main(String[] args) {
		Collection<Dog> dogList = new ArrayList<Dog>();
		Dog dog1 = new Dog("Scott",4);
		Dog dog2 = new Dog("Scott",3);
		Dog dog3 = new Dog("Bob",4);
		dogList.add(dog1);dogList.add(dog2);dogList.add(dog3);
		System.out.println(dogList);
		
		for(Dog d: dogList)
		ac.compare(dog1,dog2);
	}
}
