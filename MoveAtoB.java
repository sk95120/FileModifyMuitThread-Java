package copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class MoveAtoB extends Thread{
	private String AA = null;
	private String BB = null;
	File A = null;
	File B = null;
	public void FileMoveAtoB(String AA,String BB){
		this.AA = AA;
		this.BB = BB;		
	}

	@Override
	public void run() {
		System.out.println("MoveAtoB Thread!");
		StringSingleSimple stringsinglesimple = new StringSingleSimple().getStringSingleSimple();
		this.AA = stringsinglesimple.getAA();
		this.BB = stringsinglesimple.getBB();
		if(AA != null && BB != null) {
			int num = 0;
			A = new File(AA);
			B = new File(BB);
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
}
