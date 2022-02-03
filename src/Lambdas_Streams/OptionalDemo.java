package Lambdas_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class OptionalDemo {
    private void attendeesOptional(){
        List<Integer> attendees= Arrays.asList(22,33,44);
        Optional<Integer> attendeeOptional=attendees.stream().reduce(Integer::sum);
        System.out.println(attendeeOptional.get());
    }

    private void noAttendeesOptional(){
        List<Integer> attendees= Arrays.asList();
        Optional<Integer> noattendeeOptional=attendees.stream().reduce(Integer::sum);
        if(noattendeeOptional.isPresent())
            System.out.println(noattendeeOptional.get());

    }
    public static void main(String[] args) {
        String[] words = new String[10];
        Optional<String> checkNull =
                Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);     //empty,of,ofNullable
        } else
            System.out.println("word is null");
    }
}