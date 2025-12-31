package SearchingAlgorithms;

public class Searching<T> {
    //LinearSearch
    static <T extends Comparable<T>> boolean linearSearch(T[] data , T target){
        int index = 0;
        boolean found = false;
        while(!found && index<= data.length-1){
            System.out.println("Step " + index);
            if(data[index].equals(target))
                found = true;
            if(data[index].compareTo(target) > 0)
                break;
            index++;
        }
        return found;
    }

    //BinarySearch
    static <T extends Comparable<T>> boolean binarySearch(T[] list , T target){
        int low = 0;
        int high = list.length-1;
        boolean found = false;
        while(!found && low<=high){
            int mid = (low+high)/2;
            //comparison
            if(list[mid].compareTo(target)==0)
                found = true;
            else if(list[mid].compareTo(target) > 0)
                high=mid-1;
            else
                low = mid+1;
        }
        return found;
    }


    // main method
    static void main() {
        Integer[] numbers = {1,2,4, 10 ,90};
      boolean result= Searching.<Integer>linearSearch(numbers , 3);
      //boolean result2= Searching.<Integer>binarySearch(numbers , 8);
      if(result)
          System.out.println("item found");
      else
          System.out.println("NOT FOUND!");
    }
}
