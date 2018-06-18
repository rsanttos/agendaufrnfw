package agendaufrnfw.ufrn.imd.pds.dto;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.Student;

public class StudentDTO extends DTO {

	@Override
	public Student toObject(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, Student.class);
	}

	@Override
	public Student[] toArrayObject(String json) {
		Gson gson = new Gson();
		// json = trataJson(json);
		return gson.fromJson(json, Student[].class);
	}

}
