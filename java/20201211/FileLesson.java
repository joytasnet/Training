import java.io.*;
import java.util.*;
public class FileLesson{
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("test.txt");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		String line;
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		br.close();
	}
}
