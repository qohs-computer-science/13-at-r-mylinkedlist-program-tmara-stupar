public class MyLinkedList
{    
    private ListNode head;
    private int size;
    private ListNode temp;

    public MyLinkedList(){
        head = null;
        size = 0;
    }//end constructor

    public int size(){
        size = 0;
        temp = head;
        while (temp != null){
            size++;
		    temp = temp.getNext();
	    }
        return size;
    }//end size

    public boolean isEmpty(){
        if(head == null)
            return true;
	    else
            return false;
    }//end isEmpty

    public boolean add(Object obj){
        temp = head;
        if (head == null) {
            head = new ListNode (obj, null);
            size++;
            return true;
        }
        while (temp.getNext() != null){
		    temp = temp.getNext();
	    }
        temp.setNext(new ListNode (obj, null));
        size++;
        return true;
    }//end add

    public boolean addFirst(Object obj){
        if(head == null)
            head = new ListNode (obj, null);
        else 
            head = new ListNode (obj, head);
        size++;
        return true;
    }//end addFirst

    public boolean addLast(Object obj) {
        add(obj);
        return true;
    }//end addLast

    public Object set(int i, Object obj){
        temp = head;
        Object x = null;
        int count = 0;
        while (temp != null && count <= i){
            count++;
            if (count == i){
                x = temp.getValue();
                temp.setValue(obj);
            }//if
            temp = temp.getNext();
        }//while
        return x;
    }//end set

    public Object get(int i){
        temp = head;
        int count = 0;
        while (temp != null && count <= i){
            count++;
            if (count == i){
                return temp.getValue();
            }//if
            temp = temp.getNext();
        }//while
        return null;
    }//end get

    public Object remove(int i){
        if(i < 0 || i > size()){
            throw new IndexOutOfBoundsException();
        }
        Object x = null;
        ListNode x2;
        if (i == 1){
            x = head.getValue();
            x2 = head;
            head = head.getNext();
            x2.setNext(null);
            size--;
        }
       
        temp = head;
        int count = 0;
        while (temp != null && count <= i){
            count++;
            if (count == i-1){
                x = temp.getNext().getValue();
                x2 = temp.getNext();
                temp.setNext(temp.getNext().getNext());
                x2.setNext(null);
                size--;
            }//if
            temp = temp.getNext();
        }//while
        return x;
    }//end remove

    public Object removeFirst() {
        return remove(1);

    }//end remove first

    public Object removeLast(){
        return remove(size);
    }//end remove last


    public String toString()
    {
        temp = head;
        int num = 0;
        String str = "";
        while (temp != null){
            num++;
            str += num +": " + temp.getValue() + "\n";
            temp = temp.getNext();
	    }

        return str;
    }//end tostring

}//end CLASS
