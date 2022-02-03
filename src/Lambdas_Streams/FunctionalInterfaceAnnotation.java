package Lambdas_Streams;

public class FunctionalInterfaceAnnotation{
    @java.lang.FunctionalInterface
    interface Cruncher
    {
          int crunch(int i,int j);
    }
   public int cruncherService(int i,int j,Cruncher cruncher)
   {
       return cruncher.crunch(i,j);
   }
    public static void main(String[] args) {
        FunctionalInterfaceAnnotation obj=new FunctionalInterfaceAnnotation();
        int ans=obj.cruncherService(3,4,(p,q)->p*q);
        System.out.println("answer "+ans);
        ans=obj.cruncherService(3,4,(p,q)->p+q);
        System.out.println("answer "+ans);
    }
}
