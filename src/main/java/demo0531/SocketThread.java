package demo0531;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketThread implements Runnable{
	
	private Socket s;
	public SocketThread(Socket s) {
		super();
		this.s = s;
		
	}

	@Override
	public void run() {
		try {
			OutputStream os=s.getOutputStream();
			InputStream is=s.getInputStream();
			byte[] bys=new byte[1024];
			int len=0;
			System.out.println("我是服务器，接收到客户端信息如下");
			while((len=is.read(bys))!=-1){
				System.out.println(new String(bys,0,len));
			}
			s.shutdownInput();
			System.out.println("我是服务器，接收数据完成");
			System.out.println("开始编写反馈");
			os.write("数据我收到了".getBytes());
			s.shutdownOutput();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
