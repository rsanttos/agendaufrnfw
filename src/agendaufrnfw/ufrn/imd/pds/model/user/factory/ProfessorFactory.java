package agendaufrnfw.ufrn.imd.pds.model.user.factory;

import agendaufrnfw.ufrn.imd.pds.dto.ProfessorDTO;
import agendaufrnfw.ufrn.imd.pds.model.user.Professor;
import agendaufrnfw.ufrn.imd.pds.model.user.User;

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
