/*
Given an integer, N , print its first  multiples. Each multiple
should be printed on a new line in the form: N x i = result.
*/
package Introduction;

import java.util.Scanner;

public class JavaLoopsI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the integer:");
        int n = input.nextInt();

        for (int i = 1; i<=10; i++){
            int sum = 0;
            sum = n * i;
            System.out.printf("%d x %d = %d\n", n, i, sum);
        }
    }
}
