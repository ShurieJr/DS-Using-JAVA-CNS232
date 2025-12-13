package QUEUES;
public class CircularArrayQueue<T> {
    //data fields
    private int front , rear , counter;
    private final static int DEFAULT_CAPACITY =2;
    private T[] queue;
    //constructors
    CircularArrayQueue(int capacity){
        front = rear = counter = 0;
        queue =(T[]) new Object[capacity];
    }
    CircularArrayQueue(){
//        front = rear = counter = 0;
//        queue =(T[]) new Object[DEFAULT_CAPACITY];
        this(DEFAULT_CAPACITY);
    }
    //operations
    //size
    int size(){
        return counter;
    }
    //isempty
boolean isEmpty(){
        return counter == 0;
}
    //isFull
    boolean isFull(){
        return counter == queue.length;
    }
    //first
T first(){
        if(isEmpty()){
            System.out.println("The queue is Empty!");
            return null;
        }
        return queue[front];
}
    //enqueue
    void enqueue(T element){
        if(isFull())
            expendCapacity();
        queue[rear] = element;
        rear = (rear + 1) % queue.length;
        counter++;
    }
    //expand capacity
  private void expendCapacity(){
        T[] larger =(T[]) new Object[queue.length * 2];
        int index  =front;
        for(int i =0; i<counter; i++){
            larger[i]  = queue[index];
            index = (index  +1) % queue.length;
        }
        front = 0;
        rear = counter;
        queue = larger;
    }



    //dequeue
    T dequeu(){
        if(isEmpty()){
            System.out.println("The queue is Empty!");
            return null;
        }
        T removedElement = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        counter--;
        return removedElement;
    }

    //print elements
    void printArrayQueue(){
        if(isEmpty()){
            System.out.println("The queue is Empty!");
            return;
        }
        int index = front;
        for(int i =0; i<counter; i++){
            System.out.println(queue[index]);
            index = (index + 1) % queue.length;
        }
    }
    //main
    static void main() {
        CircularArrayQueue<String> names = new CircularArrayQueue<>(3);
        names.enqueue("Ali");
        names.enqueue("omar");
        names.enqueue("farah");
        names.enqueue("Gedi");
        names.dequeu();
        System.out.println("first: " + names.first());
        System.out.println("size: " + names.size());
        System.out.println("isEmpty: " + names.isEmpty());
        System.out.println("isFull: " + names.isFull());

        System.out.println("-------------------");
        names.printArrayQueue();
    }
}
