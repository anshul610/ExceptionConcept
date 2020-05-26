class Mythread extends Thread{
	public void run() {
		
	}
	void run(int a) {
		
	}
}
public class Overloadthread {
       public static void main(String[] args) {
		Mythread ob = new Mythread();
		ob.start();
		System.out.println("Hello");
	}
}
