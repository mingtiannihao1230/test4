package demo0531;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
	public static void main(String[] args) throws Exception {
		System.out.println("服务器启动");
		DatagramSocket ds=new DatagramSocket(12346);
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys, bys.length);
		ds.receive(dp);
		System.out.println("接收数据");
		byte[] bys2=dp.getData();
		System.out.println(new String(bys,0,bys2.length));
		
		System.out.println("反馈数据");
		String msg="我收到了";
		DatagramPacket dp2=new DatagramPacket(msg.getBytes(),msg.getBytes().length,dp.getAddress(),dp.getPort());
		ds.send(dp2);
		ds.close();
	
	}
}
