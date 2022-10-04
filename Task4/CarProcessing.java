package Task4;

import java.util.HashSet;
import java.util.Set;

public class CarProcessing {
	public static void main(String[] args) {

		CarProcessing cp = new CarProcessing();

		Car[] cars = {
				new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"),
				new Car("Jeep", "Wrangler", "Green"),
				new Car("Holden", "Falcon", "Yellow"),
				new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Civic", "Purple")
		};

		cars[0].equals(new Car("Honda", "CivicNew", "Red"));
		cars[1].equals(new Car("Holden", "Civic", "Red"));
		cars[2].equals(new Car("Jeep", "Wrangler", "Blue"));
		cars[3].equals(new Car("Jeep", "WranglerNew", "Green"));
		cars[4].equals(new Car("Holden", "Falcon", "Yellw"));
		cars[5].equals(new Car("Honda", "Civic", "Purple"));
		cars[6].equals(new Car("Honda", "Civic", "Purple"));

		Car[] noDuplicates = cp.removeDuplicates(cars);

		for(Car c : noDuplicates ) {
			System.out.println(c);
		}

		/*If an object’s hashcode is not the same as another object’s hashcode, there is no reason to execute the equals() method: you just know the two objects are not the same. On the other hand, if the hashcode is the same,
		  then you must execute the equals() method to determine whether
		  the values and fields are the same.
		 */

		Car car1 = new Car("Honda", "Civic", "black");
		Car car2 = new Car("Honda", "Civic", "black");
		boolean isHashEqual = car1.hashCode() == car2.hashCode();
		if (isHashEqual){
			System.out.println("This is hash method example");
			System.out.println("Hash function of car is equal");

		}
		else {
			System.out.println("hash function is not equal so there is no need for equal method");
			System.out.println("This is hash method example");
		}

	}

	public Car[] removeDuplicates(Car[] inputArray) {

		int end = inputArray.length;
		Set<Car> set = new HashSet<>();

		for(int i = 0; i < end; i++){
			set.add(inputArray[i]);
		}
		int n = set.size();
		Car arr[] = new Car[n];

		int i = 0;
		for (Car x : set)
			arr[i++] = x;

		return arr;

	}

}
