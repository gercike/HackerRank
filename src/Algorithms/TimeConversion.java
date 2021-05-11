package Algorithms;

public class TimeConversion {

    public static void main(String[] args) {
    }

    public String timeConversion(String s) {
        String dayHalf = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));
        switch (dayHalf) {
            case "PM":
                if (hour < 12) {
                    return hour + 12 + s.substring(2, 8);
                }
                break;
            case "AM":
                if (hour > 11) {
                    return "0" + (hour - 12) + s.substring(2, 8);
                }
                break;
        }
        return s.substring(0, 8);
    }
}
