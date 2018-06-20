package agendaufrnfw.ufrn.imd.pds.model.calendar.factory;

import agendaufrnfw.ufrn.imd.pds.dto.UndergraduateStudentCalendarDTO;
import agendaufrnfw.ufrn.imd.pds.model.calendar.CalendarUFRN;
import agendaufrnfw.ufrn.imd.pds.model.calendar.UndergraduateStudentCalendar;

public class UndergraduateStudentCalendarFactory implements CalendarUFRNFactory {

	@Override
	public CalendarUFRN createCalendarUFRN() {
		return new UndergraduateStudentCalendar();
	}

	@Override
	public CalendarUFRN createCalendarUFRNFromJson(String json) {
		UndergraduateStudentCalendarDTO ugscDto = new UndergraduateStudentCalendarDTO();		
		return ugscDto.toObject(json);
	}

}
