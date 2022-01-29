package JavaAssignments.Assignment6;

public class ConstructorOverloading {

    ConstructorOverloading()
    {
        this("Arthi");
        System.out.println("this is default constructor");
    }
    ConstructorOverloading(String input)
    {
        System.out.println("this is "+input);
    }

    public static void main(String[] args) {
        ConstructorOverloading object=new ConstructorOverloading();
    }

}
