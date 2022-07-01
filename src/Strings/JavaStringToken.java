package Strings;

import java.util.Scanner;

public class JavaStringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        if (s.length() == 0){
            System.out.print(0);
        }else {
            for (int i = 0; i < s.length(); i++) {
                int chr = s.charAt(i);
                if (chr <= 64  || chr <=96 && chr >90){
                    if (chr != 32){
                        String temp = Character.toString(chr);
                        s = s.replace(temp, " ");
                    }
                }

            }
            String newS = s.replaceAll("\\s{2,}", " ").trim();

            String[] text = newS.split(" ");
            System.out.println(text.length);
            for (String word: text)
                System.out.println(word);
        }

    }
}
