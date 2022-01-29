package JavaAssignments.Assignment7.Task7_4;

import JavaAssignments.Assignment7.Task7_4.CycleFactory;
import JavaAssignments.Assignment7.Task7_4.CycleInterface;

public class Taks7_4 {
    public static void main(String[] args) {
        CycleFactory cycleFactory = new CycleFactory();

        //get an object of UniCycle and call its wheels method
        CycleInterface thunderCycle = cycleFactory.getCycle("UniCycle");

        thunderCycle.wheels();

        //get an object of BiCycle and call its wheels method
        CycleInterface stormCycle = cycleFactory.getCycle("BiCycle");
        stormCycle.wheels();

        //get an object of TriCycle and call its wheels method
        CycleInterface rainbowCycle = cycleFactory.getCycle("TriCycle");
        rainbowCycle.wheels();

    }
}
