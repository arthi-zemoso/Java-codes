package JavaAssignments.Assignment10;

public class Assignment10 {
    public static void main(String[] args) {

        SList<String> list=new SList<>();
        SListIterator<String> it=new SListIterator<>(list);
        it.insert("M");
        System.out.println(list.toString());

        it.insert("K");
        System.out.println(list.toString());
        it.remove();
        System.out.println(list.toString());

        it.insert("J");

        it.insert("L");
        it.remove();
        System.out.println(it.isEmpty());
        System.out.println(list.toString());
    }
}
