package Exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) throws IOException {
		File a = new File("C:\\Users\\user\\Desktop\\Text.txt ");
		FileReader f = new FileReader(a);
		int temp = 0;
		while ((temp = f.read()) != -1) {
			System.out.print((char) (temp));
		}
	}
}
