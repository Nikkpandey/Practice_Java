package Networking;
import java.io.*;
import java.net.*;
public class FileServer {
    public static void main(String[] args) throws IOException{
        ServerSocket ss=new ServerSocket(778);
        Socket s=ss.accept();
        System.out.println("Connection Established");

        //to accept file fromm the client
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

        //to send file contents to the client from server
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());

        //read the file name from the client
        String fname=br.readLine();

        FileReader fr=null;
        BufferedReader file=null;
        boolean flag;

        //Create file class object with filename
        File f=new File(fname);

        if(f.exists())
            flag=true;
        else
            flag=false;
        if(flag==true)
            dos.writeBytes("Yes"+"\n");
        else
            dos.writeBytes("No"+"\n");

        if(flag==true){
            //attach the file to filereader to read data
            fr=new FileReader(fname);
            file=new BufferedReader(fr);

            String str;

            while((str=file.readLine())!=null){
                dos.writeBytes(str+"\n");
            }
            file.close();
            dos.close();
            br.close();
            fr.close();
            s.close();
            ss.close();
        }
    }
}
