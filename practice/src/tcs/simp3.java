package tcs;

public class simp3 {

	public static void main(String[] args) {
		String str="helloworld";
		int count=0;
		char targetchar='l';
		for(int i=1;i<str.length();i++) 
			if(str.charAt(i)==targetchar) {
				count++;
				
			}
			System.out.println(count);
		}
	}