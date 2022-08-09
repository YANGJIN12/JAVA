package namoo.standardapi;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class CalenderExample {
	public static void main(String[] args) {
//		Calender calender = new Calender();
//		Calender calender = new GregorianCalender();
//		Factory 메소드를 이용한 객체 생성
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar instanceof GregorianCalendar);
		System.out.println(calendar.toString());
		System.out.println(calendar.getTime());
		
		int time = calendar.get(Calendar.MILLISECOND);
		System.out.println(time);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.getTimeInMillis());
		
		calendar.set(Calendar.YEAR, 1987);
		calendar.set(1987, 4, 13);
		
		StringBuilder sb = new StringBuilder();
		sb.append(calendar.get(Calendar.YEAR)).append("-").append(calendar.get(Calendar.MONTH));
		System.out.println(sb);
		
		
		System.out.printf("%ty",calendar);
		System.out.printf("%1$tp %1$tl",calendar);
		System.out.printf("%1$tF %1$tT",calendar);
		
		
		
	String hireDate = "1987-03-01";
	String quitDate = "2020-06-03";
	
		
		
		
	}
	
	public static int betweenDay(String hireDate,String quitDate) {
		StringTokenizer st2 = new StringTokenizer(hireDate,"-");
		int hyear = Integer.parseInt(st2.nextToken());
		int hmonth = Integer.parseInt(st2.nextToken());
		int hdate = Integer.parseInt(st2.nextToken());
		
		Calendar today = Calendar.getInstance();
		int qyear = Integer.parseInt(st2.nextToken());
		int qmonth = Integer.parseInt(st2.nextToken());
		int qdate = Integer.parseInt(st2.nextToken());
		
		today.set(qyear, qmonth, qdate);
		long qtime = today.getTimeInMillis();
		
		today.set(hyear, hmonth, hdate);
		long htime = today.getTimeInMillis();
		
		int workDays =  (int)((qtime-htime)/(24*60*60*1000));
		return workDays;
		
				
	}
	
	

}
