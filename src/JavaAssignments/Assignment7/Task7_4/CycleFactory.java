package JavaAssignments.Assignment7.Task7_4;

public class CycleFactory {
    public CycleInterface getCycle(String cycleType) {
        if (cycleType == null) {
            return null;
        }
        if (cycleType.equalsIgnoreCase("UniCycle")) {
            return new Unicycle1();

        } else if (cycleType.equalsIgnoreCase("BiCycle")) {
            return new Bicycle1();

        } else if (cycleType.equalsIgnoreCase("TriCycle")) {
            return new Tricycle1();
        }

        return null;
    }
}
