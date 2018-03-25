package clientm2;
import java.util.Scanner;
import java.io.*;
import java.net.*;
public class Clientm2
{
    public static void main(String args[])
    {
    try
    {
        Socket o = new Socket(InetAddress.getLocalHost(),5000);
        System.out.println("i m client 2 setting up");
        while(true)
        {
            Scanner sc = new Scanner(System.in); 
            System.out.println("client 2 : ");
            String s = sc.nextLine();
            PrintWriter pw = new PrintWriter(o.getOutputStream(),true);
            pw.println(s);
            InputStreamReader i = new InputStreamReader(o.getInputStream());
            BufferedReader in = new BufferedReader(i);
            String str = in.readLine();
            System.out.println("server :" + str);
        }
    }           
    catch(Exception e)
    {
    System.out.println("ERROR");
    }
    }
}