package io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		String path = "c:/Temp/Dir/";
		File dir = new File(path);
		File file1 = new File(path + " file1.txt");
		File file2 = new File(path + " file2.txt");
		File file3 = new File(new URI("file:///c:/Temp/file3.txt"));
		
		if(!dir.exists()) {
			dir.mkdirs();
		}
		if(!file1.exists()) {
			file1.createNewFile();
		}
		if(!file2.exists()) {
			file2.createNewFile();
		}
		if(!file3.exists()) {
			file3.createNewFile();
		}
		
		File temp = new File("c:/Temp");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a HH:mm");
		
		File[] contents = temp.listFiles();
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + " \t" + file.getName());
			}
			System.out.println();
		}
		System.out.println("end");
		
		
	}
}
