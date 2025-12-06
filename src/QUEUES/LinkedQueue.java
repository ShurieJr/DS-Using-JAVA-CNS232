package QUEUES;

public class LinkedQueue<T> {
    //data fields
    private Node<T> head;
    private Node<T> tail;
    private int counter;

    LinkedQueue(){
//        head = tail = null;
        head =null;
        tail = null;
        counter = 0;
    }
    //operations
    //isempty
    boolean isEmpty(){
        return counter == 0;
    }
    //size
    int size(){
        return counter;
    }
    //first
    T first(){
        if(isEmpty()){
            System.out.println("The queue is Empty!");
            return null;
        }
        return head.getElement();
    }
    //enqueue
    void enqueue(T element){
        Node<T> address = new Node<>(element);
        if(isEmpty())
            head  = address;
        else
            tail.setNext(address);
        tail = address;
        counter++;
    }

    //dequeue
    T dequeue(){
        if(isEmpty()){
            System.out.println("The queue is Empty!");
            return null;
        }
        T removedElement = head.getElement();
        head = head.getNext();
        counter--;
        if(isEmpty())
            tail = null;
        return removedElement;
    }

    //print elements
    void displayElements(){
        if(isEmpty()){
            System.out.println("The queue is Empty!");
            return ;
        }
        //printing...
        Node<T> current = head;
        System.out.print("[ ");
        while(current != null){
            System.out.print(current.getElement() + " , ");
            current = current.getNext();
        }
        System.out.print(" ] ");
    }


    static void main() {
        LinkedQueue<String> names = new LinkedQueue<>();
        names.enqueue("Ali");
        names.enqueue("Osman");
        names.enqueue("Hawa");
        names.enqueue("Warsame");

       String element =  names.dequeue();
        System.out.println("Removed: " + element );
        System.out.println("Size: " + names.size());
        System.out.println("First element: " + names.first());
        names.displayElements();
    }
}
