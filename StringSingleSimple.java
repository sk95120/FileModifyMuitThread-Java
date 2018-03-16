package copy;

public class StringSingleSimple {
	private static String AA = null;
	private static String BB = null;
	private static StringSingleSimple stringsinglesimple = null;
	public static String getAA() {
		return AA;
	}
	public static void setAA(String aA) {
		AA = aA;
	}
	public static String getBB() {
		return BB;
	}
	public static void setBB(String bB) {
		BB = bB;
	}
	public StringSingleSimple() {
		if(stringsinglesimple != null)
			this.stringsinglesimple = new StringSingleSimple();
	}
	
}
