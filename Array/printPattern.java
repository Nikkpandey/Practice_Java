package Array;

public class printPattern {
    public static void printPattern(int num){
        if(num==0){
            return;
        }
        System.out.print(num+" ");
        printPattern(num-1);
        System.out.print(num+" ");
        printPattern(num-1);
        System.out.print(num+" ");
    }

    public static void main(String[] args) {
        int num=1;
        printPattern(num);
    }
}
