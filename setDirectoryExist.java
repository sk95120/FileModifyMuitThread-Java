package copy;

import java.io.File;

public class setDirectoryExist {

	public setDirectoryExist() {
		// TODO Auto-generated constructor stub
	}
	public setDirectoryExist(String Directory) {
		File file = new File(Directory);
		if((!file.isDirectory()) && (!file.exists()) ) {
			System.out.println("Ŀ¼"+Directory+"�Ѵ�����");
			file.mkdir();
		}
	}

}
