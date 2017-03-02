import java.io.File;
import java.io.IOException;

public class CreatingFileExample {

	public static void main(String[] args) {
		try {
			File file = new File("/D/Atul/newFile.txt");
			boolean isCreated = file.createNewFile();
			if (isCreated) {
				System.out.println("file created Succesfully");
			} else {
				System.out.println("file already present at specified location");
			}

		} catch (IOException e) {
			System.out.println("Exception occured");
			e.printStackTrace();

		}
	}

}
