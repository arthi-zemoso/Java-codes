package Lambdas_Streams;

public class LambdaScope extends Superscope{
    private String member="JOHN";
    interface Family
    {
        String who(String member);
    }
    public void testMember(String member)
    {
        System.out.println("local member "+member);
        System.out.println("Family member "+this.member);
        System.out.println("family member "+super.member);
        Family family=(familyMember)-> {
            System.out.println("local lambda member "+familyMember);
            System.out.println("local lambda member "+member);
            System.out.println("Family lambda thi.member "+this.member);
            System.out.println("family lambda super.member "+super.member);
            return familyMember;
        };
        family.who(member);
    }

    public static void main(String[] args) {
        new LambdaScope().testMember("SON");

    }
}
