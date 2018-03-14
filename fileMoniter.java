package copy;

import java.util.Map;
import java.util.Observer;
import java.util.concurrent.ConcurrentHashMap;

public class fileMoniter implements Runnable {
	private String aa,bb;
	private int seconds = 500;
	private Map<String,String> fileMap = new ConcurrentHashMap<String,String>();
	public void fileMoniter() {}
	public void fileMoniter(String aa,String bb) {
		this.aa = aa ;
		this.bb = bb;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {	
			if(!fileMap.containsKey(aa)) {
				//这里去复制
				fileMap.put(aa, bb);
			}
		}
	}
			
}
