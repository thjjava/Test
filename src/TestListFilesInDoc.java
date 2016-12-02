import java.io.File;


public class TestListFilesInDoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:/HTTPS");
		for(File temp : f.listFiles()) {
		if(temp.isFile()) {
			System.out.println(temp.getName());
			}
		}
	}

}
