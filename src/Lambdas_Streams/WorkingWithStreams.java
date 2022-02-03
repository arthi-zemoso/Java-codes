package Lambdas_Streams;
import java.util.*;
import java.util.AbstractList;
import java.util.stream.Stream;

public class WorkingWithStreams {
    public String[] movies={"hello","baahubali"};

    private  void testEmptyStreams(){
        Stream<Employee> emps=Stream.empty();
    }
    private static boolean  isClassic(){
        return true;

    }
    private void testStreamValue()
    {
        Stream<String> movienames=Stream.of("Gods must be crazy","hello");
        System.out.println(movienames.count());
        String[] movienames2={"hello","baahubali"};
        Stream<String> manames2=Stream.of(movienames2);
    }
    private void testIterateStream(){
        Stream<Double> randomStream=Stream.generate(Math::random);
        Stream<Integer> wholeNum=Stream.iterate(1,i->i+1);
        wholeNum.forEach(System.out::println);
    }
   // private void testIteration(){
     //   Arrays.stream(movies).filter(WorkingWithStreams::isClassic).map().forEach(System.out::println);
    //}

    public static void main(String[] args) {
        new WorkingWithStreams().testEmptyStreams();
        new WorkingWithStreams().testIterateStream();

    }
}
