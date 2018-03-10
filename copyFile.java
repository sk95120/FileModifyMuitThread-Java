package copy;

import java.io.File;
import java.io.IOException;

public class copyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File directory = new File(".");
		String nowDirectory = null;
		String AFolderDirctory = null,BFolderDirctory = null;
		
		try {
			nowDirectory = directory.getCanonicalPath().toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		AFolderDirctory = nowDirectory+"\\A";
		BFolderDirctory = nowDirectory+"\\B";
		new setDirectoryExist(AFolderDirctory);
		new setDirectoryExist(BFolderDirctory);
		new getJpgFromFolder(AFolderDirctory);
		System.out.println(BFolderDirctory); ////set
	}
}