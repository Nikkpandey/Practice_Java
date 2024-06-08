package StringPractice;

public class MutableStringPractice {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer();
        sb.append("Hello");
        sb.append(" Nikhil");
//        sb.insert(5,"!");
//
//        System.out.print(sb);

        String str=sb.toString();
        System.out.println(str);
    }
}
