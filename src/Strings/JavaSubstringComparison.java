package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaSubstringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int k = input.nextInt();

        ArrayList <String> list = new ArrayList<String>();

        for (int i = 0; i <= s.length() - k; i++){
            String temp = s.substring(i, k+i);
            list.add(temp);
        }

        Collections.sort(list);
        for (String a : list)
            System.out.println(a);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        input.close();


    }
}
