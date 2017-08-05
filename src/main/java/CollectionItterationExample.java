import java.util.*;
import java.util.function.*;

public class CollectionItterationExample {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>(
			Arrays.asList(
				new Person(19, "Dima"),
				new Person(17, "Nikita")
		));
		
		System.out.println("Using for loop");
		
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for each loop");
		
		for (Person person : people) {
			System.out.println(person);
		}
		
		System.out.println("Using forEach(Consumer<? super Person> consumer) method with LAMBDA");
		
		people.forEach(p -> System.out.println(p));
		
		System.out.println("Using forEach(Consumer<? super Person> consumer) method with Method Reference");
		
		people.forEach(System.out::println);
	}
}
