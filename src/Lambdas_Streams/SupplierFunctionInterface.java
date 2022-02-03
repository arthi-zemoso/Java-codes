package Lambdas_Streams;

public class SupplierFunctionInterface {
    public interface Supplier<T>{
        T get();
    }
    Supplier<String[]> fruitsupplier =()->new String[]{ "Apple","orange"};
    private void supplier(){
      String[] fruits= fruitsupplier.get();
      for(String fruit:fruits)
        {
            System.out.println("fruit "+fruit);
        }
    }
    public static void main(String[] args) {
        new SupplierFunctionInterface().supplier();
    }
}
