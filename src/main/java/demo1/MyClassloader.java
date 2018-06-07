package demo1;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MyClassloader extends ClassLoader{
	//��Ҫ������.class�ļ���Ŀ¼  
    private String classDir;  
    
    //�޲εĹ��췽��������class.newInstance()�������ʹ��  
    public MyClassloader(){  
    }  
    
    public MyClassloader(String classDir){  
        this.classDir = classDir;  
    }
    @SuppressWarnings("deprecation")  
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
    	//class�ļ���·��  
        String classPathFile = classDir + "/" + name + ".class";  
        try {  
            //��class�ļ����н���  
            FileInputStream fis = new FileInputStream(classPathFile);  
            ByteArrayOutputStream bos = new ByteArrayOutputStream();  
            encodeAndDecode(fis,bos);  
            byte[] classByte = bos.toByteArray();  
            //���ֽ������һ��class  
            return defineClass(classByte,0,classByte.length);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return super.findClass(name);
	}
    public static void main(String[] args) throws Exception {
    	 //�������в���  
        String srcPath = args[0];//ClassLoaderAttachment.classԭ·��  
        String desPath = args[1];//ClassLoaderAttachment.class�����·��  
        String desFileName = srcPath.substring(srcPath.lastIndexOf("\\")+1);  
        String desPathFile = desPath + "/" + desFileName;  
        FileInputStream fis = new FileInputStream(srcPath);  
        FileOutputStream fos = new FileOutputStream(desPathFile);  
        //��class���м���  
        encodeAndDecode(fis,fos);  
        fis.close();  
        fos.close();  
	}
    private static void encodeAndDecode(InputStream is,OutputStream os) throws Exception{  
        int bytes = -1;  
        while((bytes = is.read())!= -1){  
            bytes = bytes ^ 0xff;//��0xff���������  
            os.write(bytes);  
        }  
    }  

}
