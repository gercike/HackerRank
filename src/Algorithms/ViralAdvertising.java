package Algorithms;

public class ViralAdvertising {

    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }

    static int viralAdvertising(int n) {
        int shared = 5;
        int liked;
        int likesSum = 0;
        for (int i = 0; i < n; i++) {
            liked = shared / 2;
            likesSum = liked + likesSum;
            shared = liked * 3;
        }
        return likesSum;
    }
}
