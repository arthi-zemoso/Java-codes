package JavaAssignments.Assignment10;

public class Snode<T> {
    T data;
    Snode<T> next;
    Snode(){
        this.data=null;
        this.next=null;
    }
    Snode(T data){
        this.data=data;
        this.next=null;
    }
}
