package JavaAssignments.Assignment10;

public class SList<T>{
    public Snode<T> head;
    public SList(){
        head = new Snode<T>();
    }
    public SListIterator<T> Iterator(){
        return new SListIterator<T>(this);
    }
    public String toString(){
        if(head.data==null){
            return "List is empty";
        }
        else {
            Snode<T> temp = this.head;
            String s = "Single Linked list: ";
            while (temp.next != null) {
                s = s + temp.data.toString() + " ";
                temp = temp.next;
            }
            s = s + temp.data.toString() ;
            return s;
        }
    }
    }

