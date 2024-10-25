public class MyLLTester
{
  public static void main(String [] args){
    //make list
    MyLinkedList myList = new MyLinkedList();
//empty list
    System.out.println(myList.toString());
    System.out.println("is empty: " + myList.isEmpty());
    System.out.println("size of list: " + myList.size());
    System.out.println("old value: " + myList.set(4, "Comp prog 3"));
    System.out.println("new value: " + myList.get(4));

//add nodes
    myList.add("Hello");
    myList.addLast("cp3");
    myList.addFirst("volleyball");
    myList.addFirst("sand");
    myList.add("Qo");
    myList.add("Tamara");
    myList.add("poo");
    myList.add("poop");
    myList.add("monkey");
    myList.add("leaf");

    //toString
    System.out.println("\n" + myList.toString());
    //size and isEmpty
    System.out.println("size of list: " + myList.size());
    System.out.println("is empty: " + myList.isEmpty() + "\n");
    //set and get
    System.out.println("old value: " + myList.set(4, "Comp prog 3"));
    System.out.println("new value: " + myList.get(4));

    System.out.println("\n"+"new list: " + "\n" + myList.toString());
    //remove
    System.out.println("removed value: " + myList.remove(4));
    System.out.println("removed first value: " + myList.removeFirst());
    System.out.println("removed last value: " + myList.removeLast());
    System.out.println("\n"+"new list: " + "\n" + myList.toString());

  } // end main
  
} // end class
