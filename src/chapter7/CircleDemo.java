package chapter7;

public class CircleDemo {
    public static void main(String[] args) {
      Circle unitC=new Circle();
      Circle myCircle=new Circle(5);
           printparamters(unitC);
           printparamters(myCircle);
    }
    public static void printparamters(Circle circle)
    {
        System.out.println(circle.getRadius());
        System.out.println(String.format("%.2f",circle.area()));
        System.out.println(String.format("%.2f",circle.perimeter()));
    }
}
