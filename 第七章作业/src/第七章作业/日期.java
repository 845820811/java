package 第七章作业;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class 日期 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
System.out.println("请输入一个日期，日期格式为yyyy/mm/dd");
Scanner scanner=new Scanner(System.in);
String temp=scanner.nextLine();
try
{
	System.out.println(getDate(temp));
}catch (ParseException e)
{
	e.printStackTrace();
	throw e;
}
	}
public static Date getDate(String date)throws ParseException{
	DateFormat format=new SimpleDateFormat("yyyy/mm/dd");
	try {
		return new Date(format.parse(date).getTime());
	}catch (ParseException e)
	{
		e.printStackTrace();
		throw e;
	}
	
}
}
