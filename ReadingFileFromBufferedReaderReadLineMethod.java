import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileFromBufferedReaderReadLineMethod {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {

			File file = new File("/D/Atul/newFile.txt");
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);

			String content = br.readLine();
			while (content != null) {
				System.out.println(content);
				content = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (br != null) {
					br.close();
				}

			} catch (IOException e2) {
				e2.printStackTrace();
				System.out.println("error in closing the buffered Reader");

			}

		}

	}

}
