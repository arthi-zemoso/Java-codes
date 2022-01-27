package JavaAssignments.Assignment5.arthi.assignment.main;

import JavaAssignments.Assignment5.arthi.assignment.data.*;
import JavaAssignments.Assignment5.arthi.assignment.singleton.*;

public class Main {
    public static void main(String args[])
    {
         Data dataObject=new Data();
        dataObject.localVariables();
        dataObject.printValues();
        Singleton singletonObject=Singleton.getObject("ArthiAneel");
        singletonObject.printString();
    }
}
