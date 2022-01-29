package JavaAssignments.Assignment6;

public class Constructor {
    Constructor(String input)
    {
        System.out.println("this is "+input);
    }

    public static void main(String[] args) {
        Constructor object[]=new Constructor[5];           //objects are not initialized so constructor calls are not printed
    }
}
