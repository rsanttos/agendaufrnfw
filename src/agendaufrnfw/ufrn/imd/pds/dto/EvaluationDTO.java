package agendaufrnfw.ufrn.imd.pds.dto;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.calendar.Evaluation;

/**
 * Created by f202359 on 13/04/2018.
 */
public class EvaluationDTO extends DTO {

	@Override
	public Evaluation toObject(String json) {
		Gson gson = new Gson();
		return gson.fromJson(trataJson(json), Evaluation.class);
	}

	@Override
	public Evaluation[] toArrayObject(String json) {
		Gson gson = new Gson();
		// json = trataJson(json);
		return gson.fromJson(json, Evaluation[].class);
	}

}