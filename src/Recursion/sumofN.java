package Recursion;

public class sumofN {
    static void main() {
        System.out.println(sum(3));
    }

    //sum of n - 1
    static int sum(int n){
        int result;
        if(n == 1)
            result = 1;
        else
            result = n + sum(n - 1);
        return result;
    }
}
