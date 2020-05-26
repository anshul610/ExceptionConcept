import java.util.*;

class Age{
	void read(int age) throws AgeException {
		
	try {	
		if(age<18) {
			throw new AgeException("Age Must be Greater Then 18");
		}else if(age>40) {
			throw new AgeException("Age Must be Less Than 40");
		}else {
			System.out.println("Contact Soon");
		}
	}catch(AgeException ae) {
		System.out.println(ae);
	 }
	}
}
public class Shaadi {
	public static void main(String[] args) {
		Age ag= new Age();
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Age for marriage Eligibilty");
	    int age = sc.nextInt();
	    try
	    {
	    ag.read(age);
	    }catch (Exception e) {
	    	System.out.println(e);
			// TODO: handle exception
		}
	}
}
