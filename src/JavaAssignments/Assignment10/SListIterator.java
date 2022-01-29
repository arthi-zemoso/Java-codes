package JavaAssignments.Assignment10;

public class SListIterator<T>{
    Snode<T> head;
    public SListIterator(SList<T> list){
        this.head=list.head;
    }
    public void insert(T data){
        Snode<T> temp=head;
        if(!this.isEmpty()){
            Snode<T> last=new Snode<T>(data);
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=last;
        }
        else{
            temp.data=data;
            temp.next=null;
        }

    }
    public void remove(){
        Snode<T> temp=head;
        Snode<T> pre=new Snode<T>();
        if(temp.next==null) {
            temp.data = null;
        }
        else {
            while(temp.next!=null){
                pre=temp;
                temp=temp.next;
            }
            pre.next=null;

        }
    }
    boolean isEmpty(){
        if(head.data==null){
            return true;
        }
        else{
            return false;
        }
    }

}
