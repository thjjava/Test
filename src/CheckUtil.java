import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CheckUtil {

   public static boolean checkPhone(String telNum){
	   String regex = "^((13[0-9])|(15[0-9])|(18[0-9]))\\d{8}$";
       Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
       Matcher m = p.matcher(telNum);
       return m.matches();
    }
   
	public static void main(String[] args) {
		String mobile = "17721675390";
		System.out.println(checkPhone(mobile));
	}
}
