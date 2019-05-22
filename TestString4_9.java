import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString4_9 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		String str = "fesfwpupelassfwpupeladsfwpupelaf";
		Pattern p = Pattern.compile("pupel");
		Matcher m = p.matcher(str);
		StringBuffer buf = new StringBuffer();
		
		while(m.find()) 
			m.appendReplacement(buf, "pupil");
		
		System.out.println(buf);
		
	}

}
