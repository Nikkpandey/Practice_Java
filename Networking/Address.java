package Networking;
import java.io.*;
import java.net.*;
public class Address {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the website name: ");
        String site=br.readLine();

        try{
            InetAddress ip=InetAddress.getByName(site);
            System.out.println("Ip address is: "+ip);
        }
        catch(UnknownHostException uhe){
            System.out.println("Website not found");
        }
    }
}
