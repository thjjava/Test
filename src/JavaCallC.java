
public class JavaCallC {
	static{
		System.out.println(System.getProperty("java.library.path"));
		System.loadLibrary("JavaCallC");
	}
	public native String strOut(String string);
	public static void main(String[] args) {
		JavaCallC callC = new JavaCallC();
		callC.strOut("test");
	}
}
