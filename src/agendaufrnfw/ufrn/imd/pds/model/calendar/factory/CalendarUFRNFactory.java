package agendaufrnfw.ufrn.imd.pds.model.calendar.factory;

import agendaufrnfw.ufrn.imd.pds.model.calendar.CalendarUFRN;

public interface CalendarUFRNFactory {

	public CalendarUFRN createCalendarUFRN();
	
	public CalendarUFRN createCalendarUFRNFromJson(String json);

}
