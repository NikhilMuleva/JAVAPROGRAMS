package HandlingFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyPaste {

	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream("F:\\demo.txt");
			FileOutputStream fos=new FileOutputStream("F:\\new.txt");
			int i=0;
			while((i=fis.read())!=-1)
			{
				char c=(char)i;
				fos.write(c);
			}
			System.out.println("Copy Paste");
		}
		catch (Throwable e) {
			System.out.println("File Not Found");
			// TODO: handle exception
		}

	}

}
