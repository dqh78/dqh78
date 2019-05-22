import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString4_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str="asdfesdafe222.111.222.111asdwdf111.111.222.222saw";
		Pattern p = Pattern.compile("((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)");
		Matcher m = p.matcher(str);

		while (m.find()) {
		String result=m.group();
		System.out.println(result);
		}

	}
	
}
