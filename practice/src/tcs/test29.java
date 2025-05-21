package tcs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File obj=new File("C:\\Users\\Kalya\\OneDrive\\Desktop\\sem.txt");
			Scanner R=new Scanner(obj);
			while(R.hasNextLine()) {
				String data=R.nextLine();
				System.out.println(data);}
			R.close();
			}catch(FileNotFoundException e) {
				System.out.println("an error has pccured");
				e.printStackTrace();
				
			}
			}
}	