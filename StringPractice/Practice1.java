package StringPractice;

public class Practice1 {
    public static void main(String [] args){
       // String str=new String("Hello");    //creating the string
        String s ="Hello";                   //creating the string
        char [] arr={'H','e','l','l','o'};   //converting char array to string

//        String str2=new String(arr);
//        System.out.println(str2);

//        String str2=new String(arr,2,3);
//        System.out.println(str2);

          String s1=" my";
          String s2=" friend";

//          String s3=s.concat(s1).concat(s2);
//          System.out.println(s3);
//          System.out.println(s1.length());
//          System.out.println(s1.charAt(1));

//          System.out.println(s1.compareTo(s2));
//          System.out.println(s1.equals(s2));

//            System.out.println(s.replace('l','t'));
//            System.out.println(s.substring(2));
        String str="My name is Nikhil Pandey";
        String [] sa;
        sa=str.split(" ");

        for(int i=0; i<sa.length; i++){
            System.out.println(sa[i]);
        }
    }
}
