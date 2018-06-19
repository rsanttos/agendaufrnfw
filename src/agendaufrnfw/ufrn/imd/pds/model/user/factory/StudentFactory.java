package agendaufrnfw.ufrn.imd.pds.model.user.factory;

import agendaufrnfw.ufrn.imd.pds.dto.StudentDTO;
import agendaufrnfw.ufrn.imd.pds.model.user.Student;
import agendaufrnfw.ufrn.imd.pds.model.user.User;

public class StudentFactory implements UserFactory {

	@Override
	public User createUser() {
		return new Student();
	}

	@Override
	public User createUserFromJson(String json) {
		StudentDTO sDto = new StudentDTO();
		return sDto.toObject(json);
	}

}
