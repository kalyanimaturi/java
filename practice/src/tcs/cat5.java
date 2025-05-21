package tcs;

public class cat5 extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		cat5 c1=new cat5();
		
		Thread t1=new Thread(c1);
		t1.start();
		System.out.println("hi");
		t1.sleep(2000);
		System.out.println("hlo");
		
	}

}
