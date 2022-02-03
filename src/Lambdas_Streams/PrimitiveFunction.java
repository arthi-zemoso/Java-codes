package Lambdas_Streams;
import java.util.function.Predicate;
public class PrimitiveFunction {
    Predicate<Integer>  evennumberpredicate=x->x%2==0;
    private void testPredicate(int i)
    {
        evennumberpredicate.test(i);
    }

    public static void main(String[] args) {
        new PrimitiveFunction().testPredicate(30);
    }
}
