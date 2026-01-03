package SortingAlgorithms;

import java.util.Arrays;

public class Sorting <T> {
    //selectionSort (only Integer numbers)
    static void selectionSort(int[] data){
        int size = data.length;
        int min;
        for(int index=0; index<size-1; index++){
            min=index;
            for(int scan=index+1; scan<size; scan++){
                if(data[scan] < data[min])
                    min=scan;
            }
            //swap
            int temp = data[index];
            data[index] = data[min];
            data[min] = temp;
        }
    }
    //generic selection sort (any data type)
    static <T extends Comparable<T>> void genericSelectionSort(T[] data){
        int size = data.length;
        int min;
        for(int index=0; index<size-1; index++){
            min=index;
            for(int scan=index+1; scan<size; scan++){
                if(data[scan].compareTo(data[min]) < 0)
                    min=scan;
            }
            //swap
            T temp = data[index];
            data[index] = data[min];
            data[min] = temp;
        }
    }


    //main method
    static void main() {
       Integer[] marks = {23,100,2,101,3};
       String[] names = {"Osman","Ali","Gedi","Farah","Hawa"};
       Character[] gradeLetter = {'D','A' , 'C' , 'B' , 'F'};

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(gradeLetter));

        System.out.println("Sorted Array:");
        Sorting.<Integer>genericSelectionSort(marks);
        Sorting.<String>genericSelectionSort(names);
        Sorting.<Character>genericSelectionSort(gradeLetter);

        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(gradeLetter));
    }
}
