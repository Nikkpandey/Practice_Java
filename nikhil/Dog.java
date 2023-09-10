package nikhil;

public class Dog {
    public static void main(String[] args){
     boolean response=shouldWakeUp(true,-1);
        System.out.println(response);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay>=1 && hourOfDay<=23){
            if((barking==true) &&(hourOfDay<8 || hourOfDay>22)){
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
}
