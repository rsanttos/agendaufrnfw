package agendaufrnfw.ufrn.imd.pds.dto;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.user.UndergraduateStudent;

public class UndergraduateStudentDTO extends DTO {

	@Override
	public UndergraduateStudent toObject(String json) {
		Gson gson = new Gson();
		UndergraduateStudent gs = gson.fromJson(json, UndergraduateStudent.class);
		return gs;
	}

	@Override
	public UndergraduateStudent[] toArrayObject(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, UndergraduateStudent[].class);
	}

}
