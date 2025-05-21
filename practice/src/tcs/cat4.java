package tcs;
class KalyaniException extends Exception{

	public KalyaniException(String message) {
		super(message);
	}
	
}
public class cat4 {
	public static void numCheck(int num) throws KalyaniException {
		if(num%2==0) {
			throw new KalyaniException("maths ochu");
		}else {
			System.out.println("maths radhu");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			numCheck(12);
			
		}
		catch(KalyaniException e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("watever maths is confusion");
		}

	}

}