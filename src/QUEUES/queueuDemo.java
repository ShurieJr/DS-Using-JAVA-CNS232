package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class queueuDemo {
    static void main() {
        //queue interface
        Queue<Integer> stdIDs = new LinkedList<>();
        //insertion
        stdIDs.add(101);
        stdIDs.add(102);
        stdIDs.offer(103);
        //print queue elements
        System.out.println("Elements: " + stdIDs.toString());


        //first element
        System.out.println("First element (peek): " + stdIDs.peek());   //null
        System.out.println("First element (elmnt): " + stdIDs.element());  //exception
        //remove
        System.out.println("removed element : " + stdIDs.poll());  //null
        System.out.println("reomved element: " + stdIDs.remove());  //exception

        System.out.println("Elements: " + stdIDs);
        //size
        System.out.println("Size: " + stdIDs.size());
        //isempty
        System.out.println("IsEmpty : " + stdIDs.isEmpty());
    }
}
