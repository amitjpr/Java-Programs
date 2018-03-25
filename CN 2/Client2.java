package client2;
//client for single way communication
import java.net.*;
import java.io.*;
public class Client2 
{
    public static void main(String[]args)
    {
		try
                {
			Socket so = new Socket(InetAddress.getLocalHost(),4400);
			InputStreamReader i = new InputStreamReader(so.getInputStream());
			BufferedReader in = new BufferedReader(i);
			String str=in.readLine();
			System.out.println(str);
			PrintWriter p = new PrintWriter(so.getOutputStream());
			p.println("Hello! from client");
			p.flush();
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
}