import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString4_10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11";

		Pattern p = Pattern.compile("%CXLL=.*?(?=%)");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		
		}
	}

}
