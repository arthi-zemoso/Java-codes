package Lambdas_Streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stats {
    IntStream streamOfInts=IntStream.range(1,100);
    private void range()
    {
        IntStream ints=IntStream.rangeClosed(10,20);
        ints.forEach(System.out::println);
    }
    private void testMaxMin(){
        IntStream ints=IntStream.rangeClosed(10,20);
        OptionalInt max=ints.max();
        System.out.println("max "+max.getAsInt());
        IntStream ints2=IntStream.rangeClosed(10,20);
        OptionalInt min=ints2.min();
        System.out.println("max "+min.getAsInt());
        IntStream ints3=IntStream.rangeClosed(10,20);
        OptionalDouble avg= ints3.average();
        System.out.println("max "+avg.getAsDouble());
    }

    public static void main(String[] args) {
        new Stats().range();
        new Stats().testMaxMin();
    }
}
