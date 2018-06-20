package agendaufrnfw.ufrn.imd.pds.dto;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.calendar.UndergraduateStudentCalendar;

public class UndergraduateStudentCalendarDTO extends DTO {

	@Override
	public UndergraduateStudentCalendar toObject(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, UndergraduateStudentCalendar.class);
	}

	@Override
	public UndergraduateStudentCalendar[] toArrayObject(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, UndergraduateStudentCalendar[].class);
	}

}
