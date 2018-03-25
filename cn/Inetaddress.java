import java.net.*;
class Inetaddress {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println("Name: " + address.getHostName());
			System.out.println("IP address: " + address.getHostAddress());
		}
		catch(Exception e) {}
	}
}