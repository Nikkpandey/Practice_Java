package Stack;
import java.util.*;
public class Balanced {
    public static boolean checkPair(char val1,char val2){
        return((val1=='(' && val2==')') ||(val1=='[' && val2==']') ||(val1=='{' &&val2=='}'));
    }
    public static boolean checkBalanced(String expr){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<expr.length();i++){
            if(expr.charAt(i)=='(' || expr.charAt(i)=='[' || expr.charAt(i)=='{'){
                s.push(expr.charAt(i));
            }

            else{
               if(s.isEmpty()){
                   return false;
               } else if (checkPair(s.peek(),expr.charAt(i))) {
                   s.pop();
                   continue;
               }
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String expr="({})[]";
        String result;
        System.out.println(result=checkBalanced(expr)?"Balanced":"Not Balanced");
    }

}
