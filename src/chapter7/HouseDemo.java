package chapter7;

public class HouseDemo {
    public static void main(String[] args) {
        House myHouse=new House();
        House yourHouse=new House();
        myHouse.setColor("red");
        myHouse.setNumStories(5);
        myHouse.setNumWindows(10);
        yourHouse.setColor("red");
        yourHouse.setNumStories(5);
        yourHouse.setNumWindows(10);
        System.out.println("color is"+myHouse.getColor()+"stories is  "+myHouse.getNumStories()+" windows is "+myHouse.getNumWindows());
        System.out.println("color is"+yourHouse.getColor()+"stories is  "+yourHouse.getNumStories()+" windows is "+yourHouse.getNumWindows());
    }
}
