package Lambdas_Streams;

public class ConstructorREf {
    class Movie{
        public Movie(int id)
        {

        }
        public Movie(int id,String name)
        {

        }
    }
    interface  moviefactory
    {
        public Movie create(int id);
    }
    moviefactory m1=i->new Movie(i);
    moviefactory m2=Movie::new;
    public static void main(String[] args) {
        ConstructorREf obj=new ConstructorREf();
    }
}
