import java.util.Arrays;

public class TestString3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a = "ABf";
		System.out.println(a);
		
        char[] b = a.toCharArray();
        System.out.println(Arrays.toString(b));
        
        
        for (char c : b) {
        	System.out.print(Integer.valueOf(c)+ " "); 
		}
        System.out.println();
        
        char[] d = new char[b.length];
        String e = new String();
        for(int i = 0;i < b.length;i++) {
        	Integer g =Integer.valueOf(b[i]);
        	d[i] = (char) g.intValue();
        	e = e + (char) g.intValue();
        }
        System.out.println(Arrays.toString(d));
        System.out.println(e.toString());
	}

}
