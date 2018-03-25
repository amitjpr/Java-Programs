package server2;
//server for single way communication
import java.net.*;
import java.io.*;
public class Server2 
{
    public static void main(String[]args)
    {
		try
                {
			ServerSocket s= new ServerSocket(4400);//port no
			Socket so = s.accept();
			PrintWriter p = new PrintWriter(so.getOutputStream());
			p.println("Hello! from server");
			p.flush();
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
