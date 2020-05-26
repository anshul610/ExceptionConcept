import java.io.FileNotFoundException;
import java.io.FileReader;
public class DemoThrows1 {
public static void main(String[] args) {
	System.out.println("This is read before readData()");
	try {
		readData();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println("This is read after readData()");
	System.out.println("End of Main()");
}
 static void readData() throws FileNotFoundException {
	claData();
	System.out.println("End of readData()");
	
}
static void claData() throws FileNotFoundException {
	FileReader fr= new FileReader("Anshul.txt");
	System.out.println("End of claData()");
	
}
}
