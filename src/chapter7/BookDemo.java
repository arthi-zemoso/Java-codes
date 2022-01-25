package chapter7;

public class BookDemo {
    public static void main(String[] args) {
          Book GOT=new Book("Martin","GOT","fantasy",864);
          Book math=new Book("James","calculus","math",500);
          printbook(GOT);
          printbook(math);
    }
    public  static void printbook(Book b)
    {
        System.out.println(b.getTitle());
        System.out.println("by "+b.getAuthor());
        System.out.println("of "+b.getGenre());
        System.out.println(" and "+b.getNumPages());
    }
}
