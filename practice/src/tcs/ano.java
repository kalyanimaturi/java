package tcs;
class Demo{
	void show() {
		System.out.println("hi");
	}
}
public class ano {
	Demo d=new Demo() {
		void show() {
			System.out.println("hello");
			super.show();
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ano a=new ano();
		a.d.show();

	}

}
