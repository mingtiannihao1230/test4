package demo0531;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(12345);
		Socket s=ss.accept();
		//��������
		InputStream is=s.getInputStream();
		byte[] bys=new byte[1024];
		int n=is.read(bys);
		 System.out.println("�ͻ��˷�������Ϊ��" + new String(bys,0,n));
		
		//��������
		OutputStream os=s.getOutputStream();
		os.write(bys,0,n);
		os.close();
		is.close();
		s.close();
	}
}
