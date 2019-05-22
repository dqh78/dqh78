import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString4_8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int[] arr = new int[10];
		Pattern p = Pattern.compile("(\\d{1,10})");
		String s = "ae256dd—w348e6";
		Matcher m = p.matcher(s);
		int i = 0;
		while(m.find()) {
			int j = 0;
			j = Integer.parseInt(m.group());
			arr[i] = j;
			i++;
			
		}
		for(int c = 0;c < i;c++) {
			System.out.println(arr[c]);
		}
	}

}
