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
		
		System.out.println("�������Ϊ��"+a/b);	
	
}catch(NumberFormatException e){
	System.out.println("�������ָ�ʽ�쳣");
	
}
}
}
