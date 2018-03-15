package copy;

import java.util.Map;
import java.util.Observer;
import java.util.concurrent.ConcurrentHashMap;

public class fileMoniter extends Thread {
	private String aa,bb;
	private Map<String,String> fileMap = new ConcurrentHashMap<String,String>();
	public void FileMoniterFront(String aa,String bb) {
		this.aa = aa ;
		this.bb = bb;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {	
			if(aa != null && bb != null) {
				if(!fileMap.containsKey(aa)) {
					//这里去复制
					fileMap.put(aa, bb);
				}
			}
		}
	}			
}
