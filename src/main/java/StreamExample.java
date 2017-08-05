import java.util.*;
import java.util.function.*;

public class StreamExample {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>(
			Arrays.asList(
				new Person(19, "Dima"),
				new Person(17, "Nikita")
		));
		
		people.stream()
		.filter(p -> p.getAge() < 18)
		.forEach(System.out::println); // p -> System.out.println(p)
	}
}
