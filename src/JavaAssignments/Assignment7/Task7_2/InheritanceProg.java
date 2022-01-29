package JavaAssignments.Assignment7.Task7_2;

import JavaAssignments.Assignment7.Task7_2.Bicycle;
import JavaAssignments.Assignment7.Task7_2.Cycle;
import JavaAssignments.Assignment7.Task7_2.Tricycle;
import JavaAssignments.Assignment7.Task7_2.Unicycle;

//task2
public class InheritanceProg {
    public static void main(String[] args) {
        Cycle cycle[]=new Cycle[3];
        //upcasting
        cycle[0]=new Unicycle();
        cycle[1]=new Bicycle();
        cycle[2]=new Tricycle();
        //cycle[0].balance();  method balance not found in cycle class
        //cycle[1].balance();  method balance not found in cycle class
        //cycle[2].balance();  method balance not found in cycle class;
        Unicycle unicycle=new Unicycle();
        unicycle.balance();
        Bicycle bicycle=new Bicycle();
        bicycle.balance();
    }
}
