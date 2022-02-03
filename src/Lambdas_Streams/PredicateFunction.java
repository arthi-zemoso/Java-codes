package Lambdas_Streams;
import java.util.function.Predicate;
public class PredicateFunction {


    Predicate<Employee> bonuslambda= (emp)->emp.isExec(4);
    Predicate<String> empty=s->s.isEmpty();
    public static void main(String[] args) {

    }
}
