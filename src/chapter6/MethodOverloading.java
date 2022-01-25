package chapter6;

public class MethodOverloading {
    public static void main(String[] args) {
       int result=getResult(5);
        System.out.println(result);
        result=getResult(5,4);
        System.out.println(result);
        result=getResult(5,"10");
        System.out.println(result);
    }
    public static int getResult(int num)
    {
        return num*2;

    }
    public static int getResult(int num1,int num2)
    {
        return num1*num2;

    }
    public static int getResult(int num1,String value)
    {
        return num1*Integer.parseInt(value);

    }
    public static String getResult(String value1,String value)
    {
        return (value1+" "+value);

    }
}
