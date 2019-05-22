import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString4_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner Tell =new Scanner(System.in);
		String tell = Tell.nextLine();
		Pattern p = Pattern.compile("\\(\\d{4}\\)\\d{4}-\\d{4}");
		Matcher m = p.matcher(tell);
		System.out.println(m.matches());
		
	}

}
