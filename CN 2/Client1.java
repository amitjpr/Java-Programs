package client1;
//client for single way communication
import java.net.*;
import java.io.*;
public class Client1 
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
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
}
