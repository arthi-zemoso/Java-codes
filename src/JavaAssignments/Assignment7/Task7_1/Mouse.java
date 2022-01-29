package JavaAssignments.Assignment7.Task7_1;

import JavaAssignments.Assignment7.Task7_1.Rodent;

public class Mouse extends Rodent {
    Mouse()
    {
        System.out.println("This is mouse class");
    }
    @Override
    public void eat()
    {
        System.out.println("Mouse is eating");
    }
    @Override
    public void run()
    {
        System.out.println("Mouse is running");
    }
}
