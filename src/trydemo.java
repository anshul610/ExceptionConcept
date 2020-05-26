import java.io.FileNotFoundException;

public class trydemo {
public static void main(String[] args) throws FileNotFoundException {
	try {
		readData();
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("This is main Method");
	System.out.println("Main Method Terminate Normally");
}//mian closed
 static void readData() {
calData();
	}
 static void calData() {
	 showData();
 }
 static void showData() {
	 System.out.println(10/0);
 }
}
