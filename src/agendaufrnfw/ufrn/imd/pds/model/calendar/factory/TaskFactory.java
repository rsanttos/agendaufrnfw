package agendaufrnfw.ufrn.imd.pds.model.calendar.factory;

import agendaufrnfw.ufrn.imd.pds.dto.TaskDTO;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Commitment;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Task;

public class TaskFactory implements CommitmentFactory {

	@Override
	public Commitment createCommitment() {
		
		return new Task();
	}

	@Override
	public Commitment createCommitmentFromJson(String json) {
		TaskDTO tDto = new TaskDTO();
		Task t = tDto.toObject(json);
		t.setFinalDate(t.getData_entrega());
		return t;
	}

}