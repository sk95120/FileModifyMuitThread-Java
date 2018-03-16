package copy;

public class StringSingleSimple {
	private static String AA = null;
	private static String BB = null;
	private static StringSingleSimple stringsinglesimple = null;
	public String getAA() {
		return AA;
	}
	public void setAA(String aA) {
		AA = aA;
	}
	public String getBB() {
		return BB;
	}
	public void setBB(String bB) {
		BB = bB;
	}
	public StringSingleSimple() {
		if(stringsinglesimple == null)
			StringSingleSimple.stringsinglesimple = new StringSingleSimple();
	}
	
}
