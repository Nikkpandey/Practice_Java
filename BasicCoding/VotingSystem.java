package BasicCoding;

public class VotingSystem {
    public static void age(int num){
        if(num>=18){
            System.out.println("You are eligible");
        }
        else
            System.out.println("You are not eligible");

    }

    public static void main(String[] args) {
        int age=18;
        age(age);
    }
}
