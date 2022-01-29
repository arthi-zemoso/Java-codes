package JavaAssignments.Assignment7.Task7_1;

import JavaAssignments.Assignment7.Task7_1.Rodent;

public class Gerbil extends Rodent {
    Gerbil()
    {
        System.out.println("This is Gerbil class");
    }
    @Override
    public void eat()
    {
        System.out.println("Gerbil is eating");
    }
    @Override
    public void run()
    {
        System.out.println("Gerbil is running");
    }
}
