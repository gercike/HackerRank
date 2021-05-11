package Algorithms;

public class DayOfTheProgrammer {
    static String dayOfProgrammer(int year) {
        if (year == 1918){
            return "26.09.1918";
        } else{
            return isYearLeapYear(year) ? "12.09." + year : "13.09." + year;
        }
    }

    static boolean isYearLeapYear(int year) {
        if (year > 1918) {
            return year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0));
        } else {
            return year % 4 == 0;
        }
    }
}
