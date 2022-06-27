package Strings;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder B = new StringBuilder(A);
        B.reverse();
        System.out.println(B.toString());
        if (A.equals(B.toString())){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}
