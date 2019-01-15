import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SystemInfo {
    
	public static void main(String[] args) {
		File file = new File("./lanshan/answer.txt");
		if(!file.exists()){
		       try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		      }
		try {
			FileWriter fileWritter = new FileWriter(file);
			PrintWriter out = new PrintWriter(fileWritter);
			System.getProperties().list(out);
			System.out.println(System.getProperties());
			fileWritter.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
