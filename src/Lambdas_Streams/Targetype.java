package Lambdas_Streams;

public class Targetype {
    public interface Email{
        String constructEmail(String name);
    }
    Email email=(String name )->name+"@gmail.com";
    public String getEmail(String name,Email email)
    {
        return null;
    }
    public static void main(String[] args) {
        new Targetype().getEmail("arthi",(String name )->name+"@gmail.com");
    }
}
