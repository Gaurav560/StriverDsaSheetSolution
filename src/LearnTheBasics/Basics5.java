package LearnTheBasics;

import java.util.Scanner;

public class Basics5 {
    public static void solution(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int oddSum=0;
        int evenSum=0;
        while (n!=0){
        if ((n%10)%2==0){
            evenSum =evenSum+n%10;
            n=n/10;
        }if ((n%10)%2!=0){
            oddSum =oddSum+n%10;
            n=n/10;
        }
        }
        System.out.println(evenSum+" "+oddSum);
    }
    public static void main(String[] args) {
solution();
    }
}
