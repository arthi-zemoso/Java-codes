package Lambdas_Streams;

import java.util.function.Predicate;

public class ComposingPredicates {
  public void testPredicates(Employee employee){
      Predicate<Employee> find=e-> e.isExec(4);
      Predicate<Employee> emp2= e->e.isExec(5);
      Predicate<Employee> together=find.and(emp2);
      Predicate<Employee> either=find.or(emp2);
      Predicate<Employee> andor=find.and(emp2).or(emp2);
      Predicate<Employee> not=find.negate();

  }
}
