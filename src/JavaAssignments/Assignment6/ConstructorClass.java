package JavaAssignments.Assignment6;

public class ConstructorClass {
    ConstructorClass(String input)
    {
        System.out.println("THis is "+input);
    }

    public static void main(String[] args) {
        ConstructorClass object[]= new ConstructorClass[5];
        for(int i=0;i<5;i++)
        {
            object[i]=new ConstructorClass("Constructor");
        }
    }
}
