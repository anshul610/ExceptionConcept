public class Mutiplecatch {
public static void main(String[] args) {
	try {
		System.out.println("Hello");
		System.out.println("This is Try Block");
		System.out.println(10/0);
		int [] a= new int[5];
		System.out.println(a[6]);
	}catch(ArithmeticException e) {
		System.out.println("Some where divide by zero");
	}
	catch(ArrayIndexOutOfBoundsException e1) {
		System.out.println("exception occur due to array index crossed");
	}catch(Exception e2){
	    System.out.println("Exception Occurs");	
	}
	System.out.println("End of Programs");
}
}
