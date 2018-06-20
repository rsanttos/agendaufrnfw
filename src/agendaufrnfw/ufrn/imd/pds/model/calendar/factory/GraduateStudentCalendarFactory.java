package agendaufrnfw.ufrn.imd.pds.model.calendar.factory;

import agendaufrnfw.ufrn.imd.pds.dto.GraduateStudentCalendarDTO;
import agendaufrnfw.ufrn.imd.pds.model.calendar.CalendarUFRN;
import agendaufrnfw.ufrn.imd.pds.model.calendar.GraduateStudentCalendar;

public class GraduateStudentCalendarFactory implements CalendarUFRNFactory {

	@Override
	public CalendarUFRN createCalendarUFRN() {
		return new GraduateStudentCalendar();
	}

	@Override
	public CalendarUFRN createCalendarUFRNFromJson(String json) {
		GraduateStudentCalendarDTO gscDto = new GraduateStudentCalendarDTO();		
		return gscDto.toObject(json);
	}

}
