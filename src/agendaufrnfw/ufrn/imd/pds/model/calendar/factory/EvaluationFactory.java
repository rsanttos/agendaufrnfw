package agendaufrnfw.ufrn.imd.pds.model.calendar.factory;

import agendaufrnfw.ufrn.imd.pds.dto.EvaluationDTO;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Commitment;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Evaluation;

public class EvaluationFactory implements CommitmentFactory {

	@Override
	public Commitment createCommitment() {
		return new Evaluation();
	}

	@Override
	public Commitment createCommitmentFromJson(String json) {
		EvaluationDTO eDto = new EvaluationDTO();
		Evaluation e = eDto.toObject(json);
		e.setFinalDate(e.getData());
		return e;
	}

}
