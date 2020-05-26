import java.util.*;
class MarkException extends Exception{
	public MarkException(String msg) {
		System.out.println(msg);
	}
}

public class Demothrows2 {
void read(int mark)throws MarkException{
	if(mark>0) {
		throw new MarkException("Please Enter valid Marks");
	}else {
		System.out.println("Marks Added");
	}
}
public static void main(String args[]) {
	Demothrows2 ob =new Demothrows2();
	Scanner sc =new Scanner(System.in);
	System.out.println("Plese enter the marks");
	int m1=sc.nextInt();
	try {
		ob.read(m1);
	}catch(Exception e) {
		e.getMessage();
	}
}}
