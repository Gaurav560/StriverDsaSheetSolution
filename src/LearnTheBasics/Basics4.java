package LearnTheBasics;

import java.util.Scanner;

public class Basics4 {

    public static int findFibonacciNumber(int n){
        int fib1=1;
        int fib2=1;
        int res=0;
        if (n==1 || n == 2){
            return 1;
        } else {
            res=findFibonacciNumber(n-1)+findFibonacciNumber(n-2);
        }

        return res;
    }
    public static void main(String[] args) {

int num=findFibonacciNumber(7);
        System.out.println(num);
    }
}
