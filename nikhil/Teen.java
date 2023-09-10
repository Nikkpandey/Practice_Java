package nikhil;
import java.util.*;
class Teen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        boolean checked=isTeen(a,b,c);
        System.out.println(checked);
    }

    public static boolean isTeen(int a,int b,int c){
        if((a<=19) &&(a>=13)){
            return false;
        } else if ((b<=19)&&(b>=13)) {
            return false;
        } else if ((c<=19)&&(c>=13)) {
            return false;
        }
        return true;
    }
}
