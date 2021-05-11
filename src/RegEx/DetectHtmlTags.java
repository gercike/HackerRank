package RegEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHtmlTags {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/HackerRank/RegEx/htmltags.txt"));
//        Scanner s = new Scanner(System.in);
        int rows = Integer.parseInt(s.nextLine());
        Set<String> tags = new HashSet<>();
        for (int i = 0; i < rows; i++) {
            Pattern pattern = Pattern.compile("((?<=<)\\w+)");
            Matcher matcher = pattern.matcher(s.nextLine());
            while (matcher.find()){
                System.out.println(matcher.group());
                tags.add(matcher.group());
            }
        }
        List<String> tagsInList = new ArrayList<>(tags);
        Collections.sort(tagsInList);
        for (int i = 0; i < tagsInList.size(); i++) {
            System.out.print(tagsInList.get(i));
            if (i!= tagsInList.size()-1){
                System.out.print(";");
            }
        }
    }
}
