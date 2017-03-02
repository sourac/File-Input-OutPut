import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingToFileUsingFileOutputStream {
	
	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		
		try {
			
			File file=new File("/D/Atul/newFile.txt");
			fos=new FileOutputStream(file);
			String contentForFile="Face your fear";
			
			if(!file.exists()){
				file.createNewFile();
			}
			
			/*we cannot write string content directly
			 * into file so we need to convert it into byte Array*/
			
			byte[] bytes=contentForFile.getBytes();
			fos.write(bytes);
			fos.flush();
			
			System.out.println("content written succesfully for file");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(fos!=null){
					fos.close();
				}
				
			} catch (IOException e2) {
				e2.printStackTrace();
				System.out.println("error in closing the outputStream");
			}
		}
	}

}
