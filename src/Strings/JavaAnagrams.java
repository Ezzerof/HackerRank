package Strings;

import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b){

        if (a.length() != b.length()){
            return false;
        } else {
            for (int i =0; i<a.length(); i++){
                char t = a.toLowerCase().charAt(i);
                b = b.toLowerCase();
                if (b.indexOf(t) != -1){
                    b = b.replaceFirst(t + "", "");
                } else {
                    return false;
                }
            }
            return b.length() == 0;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}


