package JavaAssignments.Assignment7.Task7_1;

import JavaAssignments.Assignment7.Task7_1.Rodent;

public class Hamster extends Rodent {
    Hamster()
    {
        System.out.println("This is  hamster class");
    }
    @Override
    public void eat()
    {
        System.out.println("Hamster is eating");
    }
    @Override
    public void run()
    {
        System.out.println("Hamster is running");
    }
}
