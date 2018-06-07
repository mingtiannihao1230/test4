package demo0531;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IoDemo {
	public static void main(String[] args) throws IOException {
		InputStream is=new FileInputStream("e:/demo/obj.txt");
		OutputStream os=new FileOutputStream("e:/demo/read2obj.txt");
		//��ʽһ����ȡ����
		/*int len=0;
		while((len=is.read())!=-1){
			os.write(len);
		}*/
		//��ʽ������ȡһ�������
		byte[] bys=new byte[1024];
		int len=0;
		while((len=is.read(bys))!=-1){
			os.write(bys,0,len);
		}
		is.close();
		os.close();
	}
}
