package version8.features.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsFromDataStructures {

    public static void main(String[] args) throws IOException {

        //Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::println);
        System.out.println("IntStream Example");

        //Integer Stream with skip
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println("IntStream Example with Skip");

        //Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());

        //Stream.of, sorted and findFirst
        Stream.of("A", "B", "C")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.print(" Stream.of Example");

        //Stream from Array, sort, filter and print operations
        String[] names = {"Ann", "Bob", "Arold", "Eric", "Walter", "Jacopo", "Denis", "Shaun", "Dean", "Brandon"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("B"))
                .sorted()
                .forEach(System.out::println);
        System.out.println("Array Stream Example");


        String[] arrayTest = {"this", "is", "an", "initial", "test"};

        // Generate streams from Arrays.stream
        Stream<String> arrayToStreams1 = Arrays.stream(arrayTest);
        //Use of forEach that is a terminal stream operation
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
