import java.io.*;
import java.util.*;
public class Lesson1{
	public static void main(String[] args) throws Exception{
		FileWriter fw =new FileWriter("data.txt");
		fw.write("hello!");
		fw.close();
	}
}
