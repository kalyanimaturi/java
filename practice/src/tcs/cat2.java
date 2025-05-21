package tcs;
import java.util.*;
import java.io.*;
public class cat2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File obj=new File("C:\\Users\\Kalya\\OneDrive\\Desktop\\sample23.java");
		Scanner Reader=new Scanner(obj);
		while(Reader.hasNextLine()) {
			String data=Reader.nextLine();
			System.out.println(data);
			//throw new FileNotFoundException("file");
		}
		Reader.close();
		

	}

}
