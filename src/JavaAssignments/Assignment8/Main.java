package JavaAssignments.Assignment8;

public class Main {
    public static void main(String[] args) {
        String name="ARTHI";
        int number1=-29;
        int number2=10;
        try
        {
            if(number1<0)
                throw new NumberLessThanZero("number is less than zero");
            if(name.equals(name.toUpperCase()))
                throw new StringIsUppercase("String is uppercase");
            if(number2%2==0)
                throw new NumberIsEven("Number is a even number");
        }
        catch(Exception object)
        {
            System.out.println(object);
        }
        finally
        {
            System.out.println("All resources are deallocated");
        }
    }
}
