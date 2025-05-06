# java-tutorial



In Java, a stream is a sequence of data elements that supports sequential and parallel aggregate operations. It was introduced in Java 8 as part of the java.util.stream package.


A Stream lets you:

Process data declaratively (like SQL for collections)

Chain multiple operations (like filtering, mapping, collecting)

Avoid writing loops manually

Improve readability and efficiency


List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Print even numbers multiplied by 2
        numbers.stream()                         // Create stream
               .filter(n -> n % 2 == 0)          // Filter even numbers
               .map(n -> n * 2)                  // Multiply each by 2
               .forEach(System.out::println);    // Output result