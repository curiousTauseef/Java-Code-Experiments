package version8.features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsFromDataStructures {

	public static void main(String[] args) {
		
		String[] arrayTest = { "this", "is", "an", "initial", "test" };

		// Generate streams from Arrays.stream
		Stream<String> arrayToStreams1 = Arrays.stream(arrayTest);
		arrayToStreams1.forEach(x -> System.out.println(x));

		// Generate streams from Stream.of
		Stream<String> arrayToStreams2 = Stream.of(arrayTest);
		arrayToStreams2.forEach(x -> System.out.println(x));
		
		//Generate streams from Collections 
		List<String> itemsList = new ArrayList<>();
			itemsList.add("test1");
			itemsList.add("test2");
			itemsList.add("test3");
			itemsList.add("test4");
			itemsList.add("test5");

			itemsList.stream().forEach(item -> System.out.println(item));
			
	}

}
