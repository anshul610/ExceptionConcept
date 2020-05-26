public class Demothrow {
void read() {
	throw new ArithmeticException("Hello");
}
public static void main(String[] args) {
	Demothrow ob = new Demothrow();
	try {
		ob.read();
	}catch (Exception e) {
		System.out.println(e);
	}
}	
}

