import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Scanner;

public class TestString5_1 {

	public static void main(String[] args) throws ParseException {
		// TODO 自动生成的方法存根
		System.out.println("输入yyyy-MM-dd格式的日期");
		Scanner sc = new Scanner(System.in);
		String da = sc.nextLine();
		System.out.println(da);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse(da);
		Date newDate = addDate(date,7);
		String newdate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(newDate);
		System.out.println(newdate);
		
	}

	public static Date addDate(Date date, long day) {
		// TODO 自动生成的方法存根
		
		long time = date.getTime();
		day = day*24*60*60*1000;
		time+=day;
		return new Date(time);
	}

}
