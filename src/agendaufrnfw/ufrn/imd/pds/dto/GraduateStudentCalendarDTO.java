package agendaufrnfw.ufrn.imd.pds.dto;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.calendar.GraduateStudentCalendar;

public class GraduateStudentCalendarDTO extends DTO {

	@Override
	public GraduateStudentCalendar toObject(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, GraduateStudentCalendar.class);
	}

	@Override
	public GraduateStudentCalendar[] toArrayObject(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, GraduateStudentCalendar[].class);
	}

}
