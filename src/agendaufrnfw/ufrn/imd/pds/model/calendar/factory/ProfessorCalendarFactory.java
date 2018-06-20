package agendaufrnfw.ufrn.imd.pds.model.calendar.factory;

import agendaufrnfw.ufrn.imd.pds.dto.ProfessorCalendarDTO;
import agendaufrnfw.ufrn.imd.pds.model.calendar.CalendarUFRN;
import agendaufrnfw.ufrn.imd.pds.model.calendar.ProfessorCalendar;

public class ProfessorCalendarFactory implements CalendarUFRNFactory {

	@Override
	public CalendarUFRN createCalendarUFRN() {
		return new ProfessorCalendar();
	}

	@Override
	public CalendarUFRN createCalendarUFRNFromJson(String json) {
		ProfessorCalendarDTO pcDto = new ProfessorCalendarDTO();		
		return pcDto.toObject(json);
	}

}
