import java.io.*;
import java.net.*;
public class UDPServer {
   public static void main(String args[])throws Exception
   {
	   DatagramSocket ss = new DatagramSocket(7999);
	   System.out.println("Server running");
	   while(true) {
		   byte[] recievedata = new byte[1024];
		   byte[] senddata = new byte[1024];
		   DatagramPacket recievePacket = new DatagramPacket(recievedata,recievedata.length);
		   String message = "";
		   String modifiedmsg = "";
		   ss.receive(recievePacket);
		   message = new String(recievePacket.getData());
		   InetAddress IPAddress = recievePacket.getAddress();
		   int port = recievePacket.getPort();
		   System.out.println("FROM client"+ IPAddress+":"+message);
		   modifiedmsg = message.toUpperCase();
		   senddata = modifiedmsg.getBytes();
		   DatagramPacket sendPacket = new DatagramPacket(senddata,senddata.length,IPAddress,port);
		   ss.send(sendPacket);
		   System.out.println("Data sent successfully");
	   }
   }
}
