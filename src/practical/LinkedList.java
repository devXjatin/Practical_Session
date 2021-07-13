package practical;

public class LinkedList {
    Node head;
    public LinkedList(){
        head = null;
    }

    private boolean isEmpty(){
        return head == null;
    }

    //Enqueue method
    public void insert(Node newnode){
        if (isEmpty()){
            head = newnode;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    //Count number of Occurrence
   public int count(int search)
    {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.data == search)
                count++;
                current = current.next;
        }
        return count;
    }
}
