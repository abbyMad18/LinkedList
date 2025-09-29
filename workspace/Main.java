// abby bruskin
// 9/24/25
// this tests the linked list class and its methods
//This file contains an example of how to read user input. Use this in conjunction with your linked list class to test your program.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args)
        throws IOException
    {
     test();
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        // Reading data using readLine
        LinkedList list = new LinkedList();
        String input= reader.readLine();
        while(!input.equals("exit"))
        {
          if(input.length()>3 && input.substring(0, 3).equals("add"))
          {
            System.out.println(list.addAValue(input.substring(4)).getValue());
          }
          else if(input.equals("show"))
          {
            System.out.println(list.showValues());
          }
          else if(input.length() > 7 && input.substring(0, 6).equals("remove")){
              System.out.println("removing "+input.substring(7));
              System.out.println(list.deleteAValue(input.substring(7)).getValue());
          }
          else if(input.equals("clear"))
          {
            list.clear();
          }
          else if(!input.equals("exit")){
              System.out.println("I don't know how to "+input);
          }
          input= reader.readLine();
        }
 
        // Printing the read line
        System.out.println("thanks for playing!");
       
    }

    public static void test(){
        LinkedList list = new LinkedList();
        list.addAValue("dog");
        list.addAValue("giraffe");
        list.addAValue("ant");
        list.addAValue("cat");
        list.addAValue("elephant");
        list.addAValue("shark");
        System.out.println("original: " + list.showValues());
        list.reverse();
        System.out.println("reversed: " + list.showValues());
        list.reverse();
        System.out.println("original: " + list.showValues());
        list.nReverse(2);
        System.out.println("n2: " + list.showValues());
        list.nReverse(3);
        System.out.println("n3: " + list.showValues());
        list.deleteAValue("dog");
        System.out.println(list.showValues());
        list.addAValue("dog");
        list.deleteAValue("ant");
        System.out.println(list.showValues());
        list.addAValue("ant");
        list.deleteAValue("giraffe");
        System.out.println(list.showValues());
        list.clear();
        System.out.println(list.showValues());
    }
    
}
