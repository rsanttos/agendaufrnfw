package agendaufrnfw.ufrn.imd.pds.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String format(long mili) {
		Date date = new Date(mili);
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormatted = formatter.format(date);
		return dateFormatted;
	}
}
