package demo0531;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerThread {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(12345);
		while(true){
			Socket s=ss.accept();
			new Thread(new SocketThread(s)).start();;
		}
		
	}
}
