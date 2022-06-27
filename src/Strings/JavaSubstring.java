package Strings;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if (start >= 0 && start < end && end <= S.length()){

            String[] arr = S.split("");

            for (int i = start; i < end; i++){
                System.out.print(arr[i]);
            }

        }
        else{
            System.out.println("Wrong number.");
        }


    }
}
