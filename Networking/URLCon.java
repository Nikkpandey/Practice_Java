package Networking;
import java.io.*;
import java.util.*;
import java.net.*;
public class URLCon {
    public static void main(String[] args) throws IOException{
        URL obj=new URL("http://www.google.com/index.html");
        URLConnection conn=obj.openConnection();

        System.out.println("Date: "+new Date(conn.getDate()));
        System.out.println("Content-type: "+ conn.getContentType());
        System.out.println("Expiry: "+conn.getExpiration());
        System.out.println("last modified: "+ new Date(conn.getLastModified()));

        int l=conn.getContentLength();
        System.out.println("Length of content: "+l);
        if(l==0){
            System.out.println("Content not available");
            return;
        }
        else{
            int ch;
            InputStream in=conn.getInputStream();
            while((ch=in.read())!=-1)
                System.out.print((char)ch);
        }
    }
}
