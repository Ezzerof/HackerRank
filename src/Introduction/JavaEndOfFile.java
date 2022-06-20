/* The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.*/
package Introduction;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 1;
        while (input.hasNext()){
            String line = input.nextLine();
            System.out.println(n + " " + line);
            n++;
            if (line.equals("stop"))
                break;
        }

    }
}
