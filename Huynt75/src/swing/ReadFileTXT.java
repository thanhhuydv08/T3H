package swing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileTXT {
	String [] temp;
	String url1="E:/APLICATION_WORKING/JAVACORE & SQL SERVER/KHTN/film.txt";

public ReadFileTXT() {
	// TODO Auto-generated constructor stub
}


public String [] Film(String url) {
	File file = new File(url);
	try {
		Scanner scanner = new Scanner(file);
		String content = "";
    	  while(scanner.hasNextLine()) {// kiem tra xem la ohan tu cuoi cung chua, neu chua thi + gia tri tai vi tri con tro
    		  content += scanner.nextLine()+" ";
    	  }
    	  temp = content.split("\\s");// cat chuoi s tai vi tri khoang trang thanh mang
    	  System.out.println(temp.length);
    	  System.out.println(content);
    	//  scanner.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return temp;
}
}
