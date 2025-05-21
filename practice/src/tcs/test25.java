package tcs;

public class test25 implements Runnable {
	public void run() {
		System.out.println("hlo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new test25());
		t1.start();

	}

}
