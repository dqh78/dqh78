import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString1 {
	private static String str = "this is a test of java";
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
	}

	public static void test1(){

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if('s'==str.charAt(i)){
				count++;
			}
		}

		System.out.println(count);

	}
	
	public static void test2(){
		int start = str.indexOf("test");
		String s = str.substring(start,start+5);
		System.out.println(s);
	}
	
	public static void test3(){
		char[] ch2 = str.toCharArray();
		System.out.println(Arrays.toString(ch2));
	}
	
	public static void test4(){
		StringBuilder sb = new StringBuilder();
		Pattern pattern = Pattern.compile("^[a-zA-Z]+|\\S[a-zA-Z]*");
		Matcher matcher = pattern.matcher(str);
		String tempString = null;
		while(matcher.find()) {
			tempString = matcher.group();
			tempString = (tempString.charAt(0)+"").toUpperCase()+tempString.substring(1,tempString.length());
			sb.append(tempString).append(" ");
		}
		System.out.println(sb.toString());
	}
	
	public static void test5(){
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());
		StringBuffer sb2 = new StringBuffer();
		for (int i = str.length()-1; i >=0; i--) {
			sb2.append(str.charAt(i));
		}
		System.out.println(sb2);
		
	}
	
	public static void test6() {
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
	}
	
}
