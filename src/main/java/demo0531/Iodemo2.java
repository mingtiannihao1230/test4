package demo0531;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Iodemo2 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("e:/demo/obj.txt"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("e:/demo/bffobj.txt"));
		int len=0;
		while((len=bis.read())!=-1){
			bos.write(len);
		}
		bis.close();
		bos.close();
	}
}
