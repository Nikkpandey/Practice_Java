package Array;

public class PrintBack {
    public static void printBack(int num){
        if(num==0){
            return;
        }
        System.out.print(num+" ");
        printBack(num-1);
    }

    public static void main(String[] args) {
        int num=5;
        printBack(num);
    }
}
