package Date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateFormatConverter {

	private SimpleDateFormat simpleDateFormat;
	private String finalPattern, strDateToConvert;
	private Date dateToConvert;
	private boolean isValidPattern;
	private Locale locale;
	public static final String PATTERN_DATE_SQL = "yyyy-MM-dd";
    public static final String PATTERN_DATE_SPELL_COMMON = "EEEE, dd MMMM yyyy";


	public DateFormatConverter withDate(String strDateToConvert) {
		this.strDateToConvert = strDateToConvert;
		return this;
	}

	public DateFormatConverter withPatternConvert(String initPattern, String finalPattern, Locale locale) {
		this.finalPattern = finalPattern;
		this.locale = locale;

		simpleDateFormat = new SimpleDateFormat(initPattern, locale);
		try {
			dateToConvert = simpleDateFormat.parse(strDateToConvert);
			isValidPattern = true;
		} catch (ParseException e) {
			isValidPattern = false;
		}
		return this;
	}

	public String doConvert() {
		if (isValidPattern) {
			simpleDateFormat = new SimpleDateFormat(finalPattern, locale);
			return simpleDateFormat.format(dateToConvert);
		} else {
			return strDateToConvert;
		}
	}

	public static Date setZeroTime(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return date = calendar.getTime();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(
				new DateFormatConverter().withDate("2020-09-23 10:45:44")
		        .withPatternConvert(DateFormatConverter.PATTERN_DATE_SQL
		                , DateFormatConverter.PATTERN_DATE_SPELL_COMMON
		                , Locale.getDefault())
		                .doConvert());
	}

}
