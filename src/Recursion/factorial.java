package Recursion;

public class factorial {
    static void main() {
        //1 - N
//        for(int i=1; i<= 5; i++){
//            System.out.println(i);
//        }
//     displayNumbers(5);
        //n - 1
        System.out.println("fact(5): " +factorial(5));
        System.out.println("fact(2): " +factorial(2));
    }
//    static void displayNumbers(int n){
//        if(n == 0){
//            return;
//        }
//        else{
//            displayNumbers(n-1);
//            System.out.println(n);
//        }
//
//    }

   static int factorial(int number){
        if(number == 0)   //base case
            return 1;
        else   // recursive case
            return number * factorial(number-1);
    }
}
