class Mythread2 implements Runnable{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Sub Thread ");
		}
	}
}
public class Urunableinterface1 {
public static void main(String[] args) {
	Mythread2 my =new  Mythread2();
	Thread t = new Thread(my);
	t.start();
	   for(int i=0; i<5; i++) {
		   System.out.println("Main Thread Exceuted");
	   }
}
}
