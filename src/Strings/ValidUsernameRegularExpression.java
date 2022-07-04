package Strings;

import java.util.Scanner;

public class ValidUsernameRegularExpression {

    public static void main(String[] args) {
        String regex = "^[A-Za-z]\\w{5,29}$";

        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        while (n-- != 0){

            String username = input.nextLine();
            if (username.length()<8||username.length()>=30){
                System.out.println("Invalid");
            } else if (username.matches(regex)) {
                System.out.println("Valid");
            } else
                System.out.println("Invalid");
        }

    }

}
