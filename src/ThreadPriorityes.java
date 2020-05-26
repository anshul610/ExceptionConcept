class Mythread3 extends Thread{
	public void run() {
		System.out.println("Sub Thread Priority:" + Mythread3.currentThread().getPriority());
	}
}
public class ThreadPriorityes {
public static void main(String[] args) {
	Mythread3.currentThread().setPriority(9);
	Mythread3 my= new Mythread3();
	Thread th= new Thread(my);
	my.start();
	System.out.println("Main Thread priority:"+ Mythread3.currentThread());
}
}
