import java.io.*;
import java.net.*;
import java.util.*;
public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost",9889);
		System.out.println("enter the file name");
		BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		String fname = keyRead.readLine();
		OutputStream osstream =s.getOutputStream();
		PrintWriter pwrite = new PrintWriter(osstream,true);
		pwrite.println(fname);
		InputStream istream = s.getInputStream();
		BufferedReader sRead = new BufferedReader(new InputStreamReader(istream));
		String str;
		while((str = sRead.readLine()) != null)
{
	System.out.println(str);
}
		s.close();
	}

}
