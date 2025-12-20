package Recursion;

public class LinearArraySum {
    static void main() {
int data[] = {30 , 20 , 40 , 10 , 100};
        System.out.println(linearSum(data , data.length-1));
    }
    //
    static int linearSum(int data[] , int index){
        if (index == 0)
            return data[0];
        else
            return data[index] + linearSum(data , index-1);
    }
}
