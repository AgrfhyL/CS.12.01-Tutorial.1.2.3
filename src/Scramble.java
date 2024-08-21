import java.util.ArrayList;
import java.util.List;

public class Scramble {

    public static String scrambleWord(String word) {
        for (int i = 0; i < word.length()-1; i++) {
            String first = word.substring(i, i+1);
            String next = word.substring(i+1, i+2);
            if (first.equals("A") && !next.equals("A")) {
                word = word.substring(0, i) + next + first + word.substring(i+2);
                i+=1;
            }
        }
        return word;
    }

    public static List<String> scrambleOrRemove(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String ori = list.get(i);
            String scramb = scrambleWord(ori);
            if (ori.equals(scramb)) {
                list.remove(i);
                i--;
            } else {
                list.set(i, scramb);
            }
        }
        return list;
    }
}
