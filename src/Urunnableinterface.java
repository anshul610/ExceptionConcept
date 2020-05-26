class Mythread1 implements Runnable {
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Sub Thread");
		}
	}
}
public class Urunnableinterface {
public static void main(String[] args) {
	Mythread1 my= new Mythread1();
	my.run();
	for(int i=0; i<=5; i++) {
		System.out.println("Main Thread ");
	}
}
}
