package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass12_MyExercise {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("c:/myFolder/myImage.jpg");
			fos=new FileOutputStream("c:/myFolder/Second.jpg");
			byte[] buffer=new byte[1024];
			while(true) {
				int readBuffer=fis.read(buffer);
				if(readBuffer==-1)break;
				fos.write(buffer, 0, readBuffer);
				fos.flush();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
