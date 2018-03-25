import java.net.*;
import java.io.*;
class Client {
	public static void main(String[] args) {
		try {
			Socket o = new Socket("127.0.0.1", 2001);
			InputStreamReader i = new InputStreamReader(o.getInputStream());
			BufferedReader in = new BufferedReader(i);
			String str = in.readLine();
			System.out.println(str);
			i.close(); in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}