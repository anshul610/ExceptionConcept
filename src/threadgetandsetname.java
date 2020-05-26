
public class threadgetandsetname extends Thread {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	threadgetandsetname th= new threadgetandsetname();
	System.out.println(th.getName());
	th.setName("Hello Thread");
	System.out.println(th.getName());
	th.currentThread().setName("New Main Thread");
	System.out.println(Thread.currentThread().getName());
}
}
