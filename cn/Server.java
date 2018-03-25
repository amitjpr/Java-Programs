import java.net.*;
import java.io.*;
class Server{
	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(2001);
			Socket so = s.accept();
			PrintWriter p = new PrintWriter(so.getOutputStream());
			p.println("Hello");
			p.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}