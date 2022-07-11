import java.io.*;
import java.net.*;
public class UDPClient {

	public static void main(String[] args)throws Exception {
		BufferedReader inputstream = new BufferedReader(new InputStreamReader(System.in));
		DatagramSocket cs = new DatagramSocket();
		InetAddress IPAddress= InetAddress.getByName("localhost");
		byte[] sendData = new byte[1024];
		byte[] recievedata = new byte[1024];
		System.out.println("Enter your message here:(type end to stop)");
		while(true) {
			String message = inputstream.readLine();
			if(message.equals("END")) {
				cs.close();
				System.exit(0);
			}
			else {
				
				sendData = message.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendData,
						sendData.length,IPAddress,7999);
				cs.send(sendPacket);
				DatagramPacket recievePacket = new DatagramPacket(recievedata,recievedata.length);
				cs.receive(recievePacket);
				String modifiedmsg = new String(recievePacket.getData());
				System.out.println("From server:"+modifiedmsg);
			}
		}
		

	}

}
