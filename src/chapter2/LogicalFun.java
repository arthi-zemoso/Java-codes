package chapter2;

public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining=false;
        boolean isWarm=false;
        boolean combined=isRaining && isWarm;
        System.out.println("is it raining and warm"+combined);
        combined=isRaining || isWarm;
        System.out.println("is it raining or warm");
        combined=!isRaining;
        System.out.println("is it not raining?"+combined);
    }
}
