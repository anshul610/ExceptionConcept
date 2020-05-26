import java.io.*;
public class DemoThrows {
public static void main(String[] args) {
	try {
		Thread.sleep(100);
	}catch(InterruptedException e) {
		System.out.println(e);
	}
}
}
