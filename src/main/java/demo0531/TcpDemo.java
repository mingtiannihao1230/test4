
package demo0531;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpDemo {
	public static void main(String[] args) throws Exception, Exception {
				//建立连接
				Socket s=new Socket("192.168.136.1",12345);
				//接收数据
				InputStream is=s.getInputStream();
				//传输数据
				OutputStream os=s.getOutputStream();
				System.out.println("我是客户端，开始写入数据");
				os.write("hello".getBytes());
				System.out.println("我是客户端，写入完成");
				s.shutdownOutput();
				
				System.out.println("开始接收反馈信息");
				byte[] bys=new byte[1024];
				int len=0;
				while((len=is.read(bys))!=-1){
					System.out.println(new String(bys,0,len));
				}
				System.out.println("关闭输入流");
				s.shutdownInput();
				//关闭连接
				is.close();
				
				s.close();
	}
	
}
