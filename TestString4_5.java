import java.util.Scanner;
import java.util.regex.*; 

public class TestString4_5 {
	
	
    public static void main (String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        Pattern p = Pattern.compile ("([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})");
        Matcher m = p.matcher (str);
        System.out.println (m.matches());
        
    }
}