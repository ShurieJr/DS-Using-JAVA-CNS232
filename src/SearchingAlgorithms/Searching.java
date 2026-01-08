package SearchingAlgorithms;

import java.util.Scanner;
import java.util.Stack;

public class Searching<T> {
    static int position ;
    //LinearSearch
    static <T extends Comparable<T>> boolean linearSearch(T[] data , T target){
        int index = 0;
        boolean found = false;
        while(!found && index<= data.length-1){
            //System.out.println("Step " + index);
            if(data[index].equals(target)){
                found = true;
                position = index;
            }
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
            if(list[mid].compareTo(target)==0) {
                found = true;
                position = mid;
            }
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
        String[] names = {"ali" , "gedi" , "omar"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name to search: ");
        String searchName = input.next();

        System.out.println("Choose option: ");
        System.out.println("1.linear search");
        System.out.println("2. binary search");
        int choice = input.nextInt();
        boolean result= false;
        switch (choice){
            case 1:
                 result= Searching.<String>linearSearch(names , searchName);
                 break;
            case 2:
                result= Searching.<String>binarySearch(names , searchName);
                break;
            default:
                System.out.println("Invalid option");
        }

      if(result)
          System.out.println("item found at index [ " + position + " ]");
      else
          System.out.println("NOT FOUND!");
    }
}
