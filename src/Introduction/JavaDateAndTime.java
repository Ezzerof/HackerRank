/*
You are given a date. You just need to write the method, FindDay, which returns the day on that date.
 */
package Introduction;


import java.io.*;

import java.time.LocalDate;

    class Result {

        /*
         * Complete the 'findDay' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER month
         *  2. INTEGER day
         *  3. INTEGER year
         */

        public static String findDay(int month, int day, int year) {
            LocalDate localDate = LocalDate.of(year,month,day);
            java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();

            String theDay = dayOfWeek.toString();
            return theDay;
        }

    }

    public class JavaDateAndTime {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);

            int day = Integer.parseInt(firstMultipleInput[1]);

            int year = Integer.parseInt(firstMultipleInput[2]);

            Result.findDay(month, day, year);

            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }



