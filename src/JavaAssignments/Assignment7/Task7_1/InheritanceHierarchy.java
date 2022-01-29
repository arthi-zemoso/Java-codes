package JavaAssignments.Assignment7.Task7_1;

import JavaAssignments.Assignment7.Task7_1.Gerbil;
import JavaAssignments.Assignment7.Task7_1.Hamster;
import JavaAssignments.Assignment7.Task7_1.Mouse;
import JavaAssignments.Assignment7.Task7_1.Rodent;

public class InheritanceHierarchy {
    public static void main(String args[]) {
        Rodent rodent[] = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();
        for (int index = 0; index < 3; index += 1) {
            rodent[index].eat();
            rodent[index].run();
        }
    }
}
