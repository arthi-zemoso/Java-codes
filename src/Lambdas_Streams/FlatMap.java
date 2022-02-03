package Lambdas_Streams;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

public class FlatMap {
    String[] fruits=new String[]{"apples","oranges"};
    String[] veggies=new String[]{"beans","peas"};
    private void flatMapVeggies()
    {
        Stream<List<String>> fruitsandveggies=Stream.of(Arrays.asList(fruits),Arrays.asList(veggies));
        fruitsandveggies.flatMap(s->s.stream()).forEach(System.out::println);
    }
}
