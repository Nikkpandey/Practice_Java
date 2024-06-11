package CodingPractice;

interface printer{
    void connect();
    void disconnect();
}

class HP implements printer{
    public void connect(){
        System.out.println("Printer connected");
    }
    public void disconnect(){
        System.out.println("Printer Disconnected");
    }
}
public class InterPractice {
    public static void main(String[] args){
        HP print=new HP();
        print.connect();
        print.disconnect();
    }
}
