
// abby bruskin
// 9/24/25
// this establishes a linked list class with methods to add, remove, show, and clear values in the list
/*
Problem:  Write a program that keeps and manipulates a linked list of
	    String data. The data will be provided by the user one item at a time.
      The user should be able to do the following operations:
                     -add "String"
                                adds an item to your list (maintaining alphabetical order)
                     -remove "String"
                                if the item exists removes the first instance of it
                     -show
                                should display all items in the linked list
                     -clear
                               should clear the list
	Input:  commands listed above
	Output:  the results to the screen of each menu
	    choice, and error messages where appropriate.
*/
public class LinkedList{

  //instance variables go here (think about what you need to keep track of!)
  private ListNode head;

    //constructors go here
  public LinkedList (){
    head = null;
}

  //precondition: the list has been initialized
  //postcondition: the ListNode containing the appropriate value has been added and returned
  public ListNode addAValue(String line)
  {

    ListNode newNode = new ListNode(line, null);
    if(head == null){
      head = newNode;
    }
    else if(line.compareTo(head.getValue())<0){
      newNode.setNext(head);
      head = newNode;
    }
    else{
      ListNode temp = head;
      while((temp.getNext()!= null) && (temp.getNext().getValue().compareTo(line) < 0)){
        System.out.println(temp.getValue());
        temp = temp.getNext();
      }
      newNode.setNext(temp.getNext());
      temp.setNext(newNode);
    
    }
    System.out.println(line+ " added");
    return newNode;
  }

  //precondition: the list has been initialized
  //postcondition: the ListNode containing the appropriate value has been deleted and returned.
  //if the value is not in the list returns null
  public ListNode deleteAValue(String line)
  {
    if(head == null){
      System.out.println("list empty");
      return null;
    }
    ListNode temp = head;
    if(head.getValue().equals(line)){
      head = head.getNext();
      System.out.println("found at head");
      return temp;
    }
    else{
    while(temp.getNext()!= null && line.compareTo(temp.getNext().getValue()) != 0){
        temp = temp.getNext();
        System.out.println("keep looking");
      }
    if(temp.getNext() == null){
      System.out.println("not found");
      return null;
    }
    else {
      temp.setNext(temp.getNext().getNext());
      return temp.getNext();
    }
    
  }
  }

  //precondition: the list has been initialized
  //postconditions: returns a string containing all values appended together with spaces between.
  public String showValues()
  {
    String result = "";
    ListNode temp = head;
    while(temp != null){
      result += temp.getValue() + " ";
      temp = temp.getNext();
    }
    return result;
  }

  //precondition: the list has been initialized
  //postconditions: clears the list.
  public void clear()
  {
    head = new ListNode(null, null);
  }
}
