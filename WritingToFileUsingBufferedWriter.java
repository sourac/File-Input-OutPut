import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFileUsingBufferedWriter {

	public static void main(String[] args) {

		BufferedWriter bwr = null;
		try {

			String myContent = "or you fear will face you";
			File f = new File("/D/Atul/newFile.txt");
			f.setWritable(true); //method used to make the file writable
			f.setReadable(true); //method used to make the file readable
			//f.delete();  this method is used to delete the file
			
			if (!f.exists()) {
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f);
			bwr = new BufferedWriter(fw);
			bwr.write(myContent);
			System.out.println("file written successfully");

		} catch (IOException e) {
			e.printStackTrace();

		} finally {

			try {
				if (bwr != null) {
					bwr.close();
				}

			} catch (IOException e2) {
				e2.printStackTrace();
				System.out.println("error closing the buffered writer");
			}

		}

	}

}
