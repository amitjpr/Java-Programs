//server for single way communication
package server1;
import java.net.*;
import java.io.*;
class Server1
{
	public static void main(String[]args)
        {
		try
                {
			ServerSocket s= new ServerSocket(4400);//port no
			Socket so = s.accept();
			PrintWriter p = new PrintWriter(so.getOutputStream());
			p.println("Hello from server !");
			p.flush();
		}
		catch(Exception e)
                {
			System.out.println("error");
		}
	}
}