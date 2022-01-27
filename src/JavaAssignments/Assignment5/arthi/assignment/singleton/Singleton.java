package JavaAssignments.Assignment5.arthi.assignment.singleton;

public class Singleton {
    String member;
    public static  Singleton getObject(String member)
    {
        //this.member=member;
        //non-static variable this cannot be referenced from a static context
        Singleton object=new Singleton();
        object.member=member;
        return object;

    }
    public void printString()
    {
        System.out.println("String: "+member);
    }
}
