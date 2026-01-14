package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSorting {
    //insertion sort
    static void insertionSort(int[] data){
        int size = data.length;
        int value , position;
        //for loop
        for(int index=1; index < size; index++){
            value = data[index];
            position = index;
            //shifting.....
            while(position > 0 && value < data[position-1]){
                data[position] = data[position -1 ];
                position--;
            }
            data[position] = value;
        }
    }

    //generic insertion sort
    static <T extends Comparable<T>> void genericInsertionSort(T[] data){
        int size = data.length;
        T value ;
        int position;
        //for loop
        for(int index=1; index < size; index++){
            value = data[index];
            position = index;
            //shifting.....
            while(position > 0 && (value.compareTo(data[position-1]) <0)){
                data[position] = data[position -1 ];
                position--;
            }
            data[position] = value;
        }
    }

    //main
    static void main() {
        Integer[] studentIDs  = {100 , 23 ,1, 12, 90};
        Character[] gardeLetters  = {'D' , 'A' ,'E', 'C','B'};
        genericInsertionSort(studentIDs);
        genericInsertionSort(gardeLetters);

        System.out.println("Sorted :");
        System.out.println(Arrays.toString(studentIDs));
        System.out.println(Arrays.toString(gardeLetters));
    }
}
