package demo0531;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpClient {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket();
		String ip="192.168.136.1";
		int port=12346;
		byte[] bys="hello".getBytes();
		int len=bys.length;
		DatagramPacket dp=new DatagramPacket(bys, len,InetAddress.getByName(ip),port);
		System.out.println("发送了数据");
		ds.send(dp);
		
		byte[] bys2=new byte[1024];
		DatagramPacket dp2=new DatagramPacket(bys2, bys2.length);
		ds.receive(dp2);
		byte[] bys3=dp2.getData();
		String ss=new String(bys3,0,bys3.length);
		System.out.println(ss);
		ds.close();
		
	}
}
