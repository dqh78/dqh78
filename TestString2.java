
public class TestString2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str = "i have an apple";
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1.delete(7, sb1.length()));//删除
		System.out.println(sb1.reverse());//倒序
		
		StringBuffer sb2 = new StringBuffer(str);
		System.out.println(sb2.append(" pen"));//添加
		System.out.println(sb2.insert(str.length(), " and"));//插入
		
		String s = new String(sb2);
		System.out.println(s+"!");
	}

}
