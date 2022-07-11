import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
public class TcpServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss= new ServerSocket(9889);
        System.out.println("server waiting for connection from client");
        Socket s = ss.accept();
        System.out.println("connection is successful");
        InputStream istream = s.getInputStream();
        OutputStream osstream = s.getOutputStream();
        BufferedReader fileRead = new BufferedReader(new InputStreamReader(istream));
        String fname = fileRead.readLine();
        BufferedReader contentRead = new BufferedReader(new FileReader(fname));
        PrintWriter pwrite = new PrintWriter(osstream,true);
        String str;
        while((str=contentRead.readLine())!=null)
        {
        	pwrite.println(str);
        }
        s.close();
        ss.close();
	}

}
