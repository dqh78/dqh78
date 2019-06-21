package pro_3;

public class UseExecption {
	
		


public static int parseInt(String str) {

    char[] array = str.toCharArray();

    return parseInt(array);
}


private static int parseInt(char[] array) {

	return 0;
}




public static void main(String[] args) {
	try {
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		
		System.out.println("两数相除为："+a/b);	
	
}catch(NumberFormatException e){
	System.out.println("捕获数字格式异常");
	
}
}
}
