package ThreadPractice;
import java.awt.*;
//a moving banner using a thread
public class Banner extends Frame implements Runnable {

    String str="Nikhil Pandey Here ";

    Banner(){
        setLayout(null);   //don't set Layout Manager
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    public void paint(Graphics g){
        //set a font and display the banner string
        Font f=new Font("Courier",Font.BOLD,40);
        g.setFont(f);
        g.drawString(str,10,100);
    }
    public void run(){
        //move banner continuously
        for(;;){
            repaint();                             //refresh the frames contents
            try{
                Thread.sleep(400);          //give a gap of 400 millis between each movement
            }catch(Exception e){}
            char ch=str.charAt(0);                //extract first char from string
            str=str.substring(1,str.length());    //add to str from second char till end
            str=str+ch;                           //attach first char at the end of str
        }
    }

    public static void main(String[] args) {
        Banner b=new Banner();              //b represents the frame
        b.setSize(400,400);
        b.setTitle("My Banner");
        b.setVisible(true);

        Thread t=new Thread(b);
        t.start();
    }
}
