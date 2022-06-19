package Introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        String s1 = sc.next();
        int a = sc.nextInt();
        String s2 = sc.next();
        int b = sc.nextInt();
        String s3 = sc.next();
        int c = sc.nextInt();

        System.out.printf("%-15s%03d\n", s1, a);
        System.out.printf("%-15s%03d\n", s2, b);
        System.out.printf("%-15s%03d\n", s3, c);

        System.out.println("================================");
        sc.close();
    }
}
