package Lambda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher("ab1bsfns$%gz#");

        while (m.find()){
            System.out.println(m.start()+"--------"+m.group());
        }
    }
}
