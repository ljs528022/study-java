package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
//		기본으로 알아야할 날짜 타입(Date, Calendar)
//		Date : 기본적으로 날짜 계살을 할 때에 사용되는 클래스.
//			허나, 현제 버전에소는 날짜를 조정하거나 활용할 때는 여러 이유로 사용되지 않음
		
//		Date date = new Date();
//		System.out.println(date);
		
//		deprecated: 사용하는 것을 권장하지 않는다.
//		System.out.println(date.getDate());
		
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DATE));
		
		Calendar date = Calendar.getInstance();
		date.set(2035, 11, 4);
//		System.out.println(date.getTime());
		
//		원하는 형식의 날짜로 변경 (Date -> String)
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String time = simpleDateFormat.format(date.getTime());
//		System.out.println(time);
		
//		특정 형식의 문자열을 날짜로 변경 (String -> Date)
		String content = "2025-12-25";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date time = simpleDateFormat.parse(content);
			System.out.println(time);
		} catch (ParseException e) {
			System.out.println("형식이 맞지 않습니다!");
			e.getStackTrace();
		}
		
	}
}
