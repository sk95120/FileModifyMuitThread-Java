package copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class MoveAtoB {
	public void FileMoveAtoB(String AA,String BB){
			int num = 0;
			File A = new File(AA);
			File B = new File(BB);
			FileInputStream in;
			try {
				in = new FileInputStream(A);
				FileOutputStream out = new FileOutputStream(B);
				byte[] byteStream = new byte[1024];
				while((num=in.read(byteStream))!= -1) {
					out.write(byteStream,0,num);
				}
				in.close();
				out.close();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
	} 
}
