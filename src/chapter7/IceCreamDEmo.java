package chapter7;

public class IceCreamDEmo {
    public static void main(String[] args) {
     IceCream myice=new IceCream("choco",20,2);
     myice.addToppings("sprinkles");
     myice.addToppings("choco chips");
        System.out.println(myice.getName());
        System.out.println(myice.getCost());
        System.out.println(myice.getNumScoops());
        System.out.println(myice.getToppings());
        myice.printTopping();
    }
}
