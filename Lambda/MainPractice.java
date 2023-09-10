package Lambda;
import java.util.regex.*;
public class MainPractice {
    public static void main(String[] args) {

        String str="abc@prepinsta.com";
        Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m=p.matcher(str);
        if(m.find()&&m.group().equals(str))
        {
            System.out.println("valid mail id");
        }
        else
        {
            System.out.println("invalid mail id");
        }
        }
    }