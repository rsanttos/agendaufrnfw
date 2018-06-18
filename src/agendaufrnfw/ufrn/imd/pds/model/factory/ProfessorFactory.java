package agendaufrnfw.ufrn.imd.pds.model.factory;

import agendaufrnfw.ufrn.imd.pds.dto.ProfessorDTO;
import agendaufrnfw.ufrn.imd.pds.model.Professor;
import agendaufrnfw.ufrn.imd.pds.model.User;

public class ProfessorFactory implements UserFactory {
	
	@Override
	public User createUser() {
		return new Professor();
	}

	@Override
	public User createUserFromJson(String json) {
		ProfessorDTO pDto = new ProfessorDTO();
		return pDto.toObject(json);
	}
}
