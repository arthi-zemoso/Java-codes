package chapter6;

public class MethodDemo {
    public static void main(String[] args) {
        printhello();
        printnumber(10);
         int result=giveme10();
         int sum=add(5,4);
    }
    public static void printhello()
    {
        System.out.println("hello");
    }
    public static void printnumber(int k)
    {
        System.out.println(k);
    }
    public static int  giveme10()
    {
        return 10;
    }
    public static int add(int n1,int n2)
    {
        return n1+n2;
    }
}
