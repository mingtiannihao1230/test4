
package demo0531;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpDemo {
	public static void main(String[] args) throws Exception, Exception {
				//��������
				Socket s=new Socket("192.168.136.1",12345);
				//��������
				InputStream is=s.getInputStream();
				//��������
				OutputStream os=s.getOutputStream();
				System.out.println("���ǿͻ��ˣ���ʼд������");
				os.write("hello".getBytes());
				System.out.println("���ǿͻ��ˣ�д�����");
				s.shutdownOutput();
				
				System.out.println("��ʼ���շ�����Ϣ");
				byte[] bys=new byte[1024];
				int len=0;
				while((len=is.read(bys))!=-1){
					System.out.println(new String(bys,0,len));
				}
				System.out.println("�ر�������");
				s.shutdownInput();
				//�ر�����
				is.close();
				
				s.close();
	}
	
}
