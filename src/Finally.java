public class Finally {
public static void main(String[] args) {
	try {
		System.out.println("Try Block Exceuted");
		System.out.println(10/0);
	}catch(ArithmeticException e) {
		System.out.println("Catch Block executed");
	}
	finally {
		System.out.println("Finally Block Exceuted");
	}
}
}
