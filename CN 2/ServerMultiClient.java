package servermulticlient;
import java.util.Scanner;
import java.io.*;
import java.net.*;
class ServerMultiClient
{
   public static void main(String args[])
   {
    ServerSocket s = null;
    try
    { s = new ServerSocket(5000);
    }
    catch(Exception e)
    {
    System.out.println("Error");
    }
    int i=1;
    while(true)
    {
        try
        {
            
            Socket so = s.accept();
            ServerThread st = new ServerThread(so);
            System.out.println("Connecting...."+ i++);
            st.start(); 
        }
        catch(Exception e)
        {
        System.out.println("Error");
        }
    }
 }
}
class ServerThread extends Thread
{
    Socket so =null;
    BufferedReader br = null;
    InputStreamReader isr = null;
    ServerThread (Socket so)
    {
    this.so = so;
    }
    public void run()
    {
    try
    {
        System.out.println("Connection established");
        while(true)
        {

            isr = new InputStreamReader(so.getInputStream());
            br = new BufferedReader(isr);
            String str = br.readLine();
            System.out.println(str);
            Scanner sc = new Scanner(System.in);
            System.out.println("server : ");
            String st = sc.nextLine();
            PrintWriter pw = new PrintWriter(so.getOutputStream(),true);
            pw.println(st);
        }
    }
    catch(Exception e)
    {
        System.out.println("Error");
    }
    }
}