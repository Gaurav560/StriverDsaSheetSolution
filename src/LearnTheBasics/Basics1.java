package LearnTheBasics;

import java.util.Scanner;

public class Basics1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the character ");
        String str=scanner.next();
        if (str.charAt(0)>='a' && str.charAt(0)<='z'){
            System.out.println("0");
        } else if (str.charAt(0)>='A' && str.charAt(0)<='Z') {
            System.out.println("1");
        }else {
            System.out.println("-1");
        }
    }
}
