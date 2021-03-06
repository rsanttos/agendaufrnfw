package agendaufrnfw.ufrn.imd.pds.dto;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.user.Professor;

public class ProfessorDTO extends DTO {

	@Override
	public Professor toObject(String s) {
		Gson gson = new Gson();
		return gson.fromJson(s, Professor.class);
	}

	@Override
	public Professor[] toArrayObject(String s) {
		Gson gson = new Gson();
		return gson.fromJson(s, Professor[].class);
	}
}
