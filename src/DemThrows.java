import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemThrows {
public static void main(String[] args) {
	System.out.println("Hello , Here File not Found Exception");
	try {
		FileReader fr= new FileReader("Anshul1.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
	System.out.println("End of Program one1");
	System.out.println("End of Program two2");
}
}
