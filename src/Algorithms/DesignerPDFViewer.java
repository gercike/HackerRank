package Algorithms;

public class DesignerPDFViewer {

    static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            int height = h[(int) word.charAt(i) - 97];
            if (height > max) {
                max = height;
            }
        }
        return max * word.length();
    }
}
