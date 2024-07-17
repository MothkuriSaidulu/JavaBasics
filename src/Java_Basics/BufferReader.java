package Java_Basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReader {

	public static void main(String[] args) throws Exception {

		String rootPath = System.getProperty("user.dir");
		File filePath = new File(rootPath + "\\FilesReader\\My accounts.xlsx");
		FileReader fileReader = new FileReader(filePath);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String data = "";

		while ((data = bufferReader.readLine()) != null) {
//			String data = bufferReader.readLine();
			System.out.println(data);
		}
	}
}