package Stack;

import java.util.Stack;

public class Postfix {
    static boolean checkIfOperand(char ch){
        return(ch>='a'&&ch<='z' ||ch>='A'&&ch<='Z');
    }

    static int precedence(char ch){
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    static void convertInfixToPostFix(String expr){
        int i;
        Stack<Character>s=new Stack<>();
        StringBuilder result=new StringBuilder(new String(" "));
        for(i=0; i<expr.length(); ++i){
            if(checkIfOperand(expr.charAt(i)))
                result.append(expr.charAt(i));
            else if (expr.charAt(i)=='(') {
                s.push(expr.charAt(i));
            } else if (expr.charAt(i)==')') {
                while(!s.isEmpty() && s.peek()!='('){
                    result.append(s.peek());
                    s.pop();
                }
                if(!s.isEmpty() &&s.peek()!='('){
                    return;
                }
                else
                    s.pop();
            }
            else {
                while(!s.isEmpty() && precedence(expr.charAt(i))<=precedence(s.peek())){
                    result.append(s.peek());
                    s.pop();
                }
                s.push(expr.charAt(i));
            }
        }
        while(!s.isEmpty()){
            result.append(s.peek());
            s.pop();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String expression="a+b*(c^d-e)^(f+g*h)-i";
        convertInfixToPostFix(expression);
    }
}
