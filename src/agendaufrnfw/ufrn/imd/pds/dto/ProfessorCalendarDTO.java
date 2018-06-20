package agendaufrnfw.ufrn.imd.pds.dto;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.calendar.ProfessorCalendar;

public class ProfessorCalendarDTO extends DTO {

	@Override
	public ProfessorCalendar toObject(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, ProfessorCalendar.class);
	}

	@Override
	public ProfessorCalendar[] toArrayObject(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, ProfessorCalendar[].class);
	}

}
