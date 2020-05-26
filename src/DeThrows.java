import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.MalformedInputException;

public class DeThrows {
public static void main(String[] args) throws FileNotFoundException{
	FileReader fr =new FileReader("anshul.txt");
	System.out.println("End of Program One");
	System.out.println("End of Program two");
}
}
