package Lambdas_Streams;

interface iMovie
{
    public boolean check(int id);
}
public class MethodREferences {
    public void testMovie()
    {
        iMovie i1=(i)->i<100?true:false;
        iMovie i2=MethodREferences::isClassic;

    }
    private void testref()
    {
        MethodREferences m=new MethodREferences();
        iMovie m1=(i)->i>10 && i<100?true:false;
        iMovie m2= m::is10;
    }
    public boolean is10(int id)
    {
        return true;
    }
    public static boolean isClassic(int id)
    {
        return true;
    }
}
