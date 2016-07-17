package com.pkg1;

//Demonstrate FileOutputStream.
import java.io.*;
class FileOutputStreamDemo {
public static void main(String args[]) throws Exception {
String source = "The following example creates a sample buffer of"
		+ " bytes by first making a String and then using the getBytes( ) "
		+ "method to extract the byte array equivalent. It thencreates three files."
		+ " The first, file1.txt, will contain every other byte from the sample."
		+ " The second, file2.txt, will contain the entire set of bytes. The third and "
		+ "last, file3.txt, will contain only the last quarter. Unlike the "
		+ "FileInputStream methods, all of the FileOutputStream methods have a return "
		+ "type of void. In the case of an error, these methods will throw an IOException.";
byte buf[] = source.getBytes();
//OutputStream f0 = new FileOutputStream("file1.txt");
//for (int i=0; i < buf.length; i += 2) {
//f0.write(buf[i]);
//}
//f0.close();
OutputStream f1 = new FileOutputStream("writeFile.txt");
f1.write(buf);
f1.close();
//OutputStream f2 = new FileOutputStream("file3.txt");
//f2.write(buf,buf.length-buf.length/4,buf.length/4);
//f2.close();
}
}
