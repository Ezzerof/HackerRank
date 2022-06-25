/*
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
Given two strings of lowercase English letters, A  and B, perform the following operations:
Sum the lengths of A and B.
Determine if A  is lexicographically larger than B (i.e.: does A come before B in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
*/

package Strings;

import java.io.*;
import java.util.*;
import java.util.Arrays;

public class JavaStringIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());

        char array[] = A.toCharArray();
        char array2[] = B.toCharArray();

        if (array[0] > array2[0]){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        A = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        B = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(A + " " + B);

    }
}
