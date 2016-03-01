
public class AnimalCompare implements Comparator<Animal> {

	public int compare(Animal a1, Animal a2) {
		if(a1.name.equals(a2.name)) {
			if(a1.legs == a2.legs) {
				return 0;
			} else if(a1.legs > a2.legs) {
				return 1;
			} else {
				return -1;
			}
		} else if(a1.name.compareToIgnoreCase(a2.name) == 1){
			return 1;
		} else {
			return -1;
		}
	}
}
