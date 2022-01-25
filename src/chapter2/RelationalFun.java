package chapter2;

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool=true;
        boolean yourBool=false;
        int myAge=37;
        int yourAge=20;
        int bobAge=20;
        System.out.println("mybool"+myBool);
        System.out.println("yourbool"+yourBool);
        boolean ageCompare=myAge>yourAge;
        System.out.println("myAge>yourAge?"+ageCompare);
        ageCompare=yourAge>bobAge;
        System.out.println("yourAge>bobAge"+ageCompare);
        ageCompare=yourAge==bobAge;
        System.out.println("yourAge==bobAge?"+ageCompare);
        String myName="John";
        String yourName="Johnny";
        boolean nameCompare=myName.equals(yourName);
        System.out.println("are they same name"+nameCompare);
        int currentAGe=21;
        boolean compare=currentAGe>=21;
        System.out.println("greater than 21"+compare);
    }

}

