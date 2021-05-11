package DaysOfCode.Day26NestedLogic;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NestedLogic {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner s = new Scanner(new File("src/HackerRank/DaysOfCode/Day26NestedLogic/file.txt"));
        Scanner s = new Scanner(System.in);
        int returnDay = s.nextInt();
        int returnMonth = s.nextInt();
        int returnYear = s.nextInt();
        int dueDay = s.nextInt();
        int dueMonth = s.nextInt();
        int dueYear = s.nextInt();
        LocalDate dateReturn = LocalDate.of(returnYear, returnMonth, returnDay);
        LocalDate dateDue = LocalDate.of(dueYear, dueMonth, dueDay);
        System.out.println(dateReturn.isAfter(dateDue));
        int fine = 0;
        if (!dateReturn.isAfter(dateDue)) {
            fine = 0;
        } else {
            if (dateReturn.getYear() == dateDue.getYear()) {
                if (dateReturn.getMonth() == dateDue.getMonth()) {
                    fine = (int) ChronoUnit.DAYS.between(dateDue, dateReturn) * 15;
                } else {
                    fine = (int) ChronoUnit.MONTHS.between(dateDue, dateReturn) * 500;
                }
            } else {
                fine = 10000;
            }
        }
        System.out.println(fine);
    }
}
