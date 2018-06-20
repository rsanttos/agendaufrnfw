package agendaufrnfw.ufrn.imd.pds.dto;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.user.GraduateStudent;

public class GraduateStudentDTO extends DTO {

	@Override
	public GraduateStudent toObject(String json) {
		Gson gson = new Gson();
		GraduateStudent gs = gson.fromJson(json, GraduateStudent.class);
		return gs;
	}

	@Override
	public GraduateStudent[] toArrayObject(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, GraduateStudent[].class);
	}

}
