package demo0531;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Iodemo3 {
	public static void main(String[] args) throws IOException {
		/*FileReader fr=new FileReader("e:/demo/obj.txt");
		FileWriter fw=new FileWriter("e:/demo/fobj.txt");*/
		BufferedReader br=new BufferedReader(new FileReader("e:/demo/obj.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("e:/demo/objsjj.txt"));
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.flush();
		}
		br.close();
		bw.close();
	}
}	
