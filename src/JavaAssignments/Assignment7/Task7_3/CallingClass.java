package JavaAssignments.Assignment7.Task7_3;

public class CallingClass {
    public static void main(String[] args) {
        Implementation obj=new Implementation();
        obj.inputInterface1(obj);
        obj.inputInterface2(obj);
        obj.inputInterface3(obj);
        obj.inputInterface4(obj);
        obj.method1_1();
        obj.method2_1();
        obj.method3_1();
        obj.method4_1();
    }
}
