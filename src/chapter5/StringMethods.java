package chapter5;

public class StringMethods {
    public static void main(String[] args) {
        String name1="John Baugh";
        String name2="John Baugh";
        String name3="Rob Pierce";
        String challenge="java";
        for(int i=0;i<name1.length();i++)
        {
            System.out.println(name1.charAt(i)+" ");
        }
        System.out.println();
        if(name1.equals(name2))
        {
            System.out.println("they are equal");
        }
        else
            System.out.println("not equal");
        if(name1.compareTo(name3)>0)
        {
            System.out.println("name1>name3");
        }
        else
            System.out.println("name1<=name3");
        System.out.println("challenge");
        if(challenge.compareTo(name1)>0)
        {
            System.out.println(challenge+"is greater than "+name1);
        }
        else
            System.out.println(challenge+" is not greater than "+name1);
    }
}
