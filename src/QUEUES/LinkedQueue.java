package QUEUES;

public class LinkedQueue<T> {
    //data fields
    private Node<T> head;
    private Node<T> tail;
    private int counter;

    LinkedQueue(){
    //head = tail = null;
        head =null;
        tail = null;
        counter = 0;
    }
    //operations
    //isEmpty()
    boolean isEmpty(){
        return counter == 0;
    }
    //size()
    int size(){
        return counter;
    }
    //first element
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

    //search even and odd
    void displayEvenOdd(){
        int oddCount = 0;
        int evenCount = 0;
        Node<T> current = head;
        //odd
        System.out.println("Odd numbers:");
        while(current != null){
            if(((int) current.getElement() % 2) !=0){
                System.out.println(current.getElement());
                oddCount++;
            }
            current = current.getNext();
        }
        System.out.println("odd count: " + oddCount);
        //even
        System.out.println("---------------------");
        current = head;
        System.out.println("Even numbers:");
        while(current != null){
            if((int)current.getElement() % 2 == 0) {
                System.out.println(current.getElement());
                evenCount++;
            }
            current = current.getNext();
        }
        System.out.println("Even Count: " + evenCount);
    }


    static void main() {
        LinkedQueue<Integer> numbers = new LinkedQueue<>();
        numbers.enqueue(10);
        numbers.enqueue(12);
        numbers.enqueue(11);
        numbers.enqueue(39);
        numbers.enqueue(37);

      numbers.displayEvenOdd();
        System.out.println("-------------");
        numbers.displayElements();
    }
}
