package Introduction;

import java.util.Scanner;

public class JavaDatatypes {


    public static final byte B_NEGATIVE = -128;
    public static final byte B_POSSITIVE = 127;
    public static final short S_NEGATIVE = -32768;
    public static final short S_POSSITIVE = 32767;
    public static final int I_NEGATIVE = -2147483648;
    public static final int I_POSSITIVE = 2147483647;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i<n; i++){

            try{
                long x = input.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x>= B_NEGATIVE && x<=B_POSSITIVE)
                    System.out.println("* byte");
                if (x>=S_NEGATIVE && x<=S_POSSITIVE)
                    System.out.println("* short");
                if (x>=I_NEGATIVE && x<=I_POSSITIVE)
                    System.out.println("* int");
                if (x >= -(Math.pow(2,64-1)) && x <= (Math.pow(2,64-1)-1))
                    System.out.println("* long");

            } catch (Exception e){
                System.out.println(input.next() + " can't be fitted anywhere.");
            }

        }
    }
}
