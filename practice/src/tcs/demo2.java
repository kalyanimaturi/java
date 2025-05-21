package tcs;
class Animal{
	void sleep() {
		System.out.println("sleeping");
	}
	
}
class dog extends Animal{
	void bark() {
		System.out.println("dog is barking");
	}
}
public class demo2 {

	public static void main(String[] args) {
		dog d=new dog();
		d.bark();
		d.sleep();;
		// TODO Auto-generated method stub

	}

}
