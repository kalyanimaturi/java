package tcs;



public class pattern {

	public static void main(String[] args) {
		System.out.println(args[0]);
		String color=args[0];
		switch(color){
		case "red":
			System.out.println("celebrate holi");
			break;
		case "green":
			System.out.println("ramzan");
		break;
		case "white":
			System.out.println("christmas");
		break;
		default:
		System.out.println("no fest");
		

	}

}
}
