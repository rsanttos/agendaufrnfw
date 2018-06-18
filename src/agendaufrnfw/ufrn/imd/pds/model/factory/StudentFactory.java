package agendaufrnfw.ufrn.imd.pds.model.factory;

import agendaufrnfw.ufrn.imd.pds.dto.StudentDTO;
import agendaufrnfw.ufrn.imd.pds.model.Student;
import agendaufrnfw.ufrn.imd.pds.model.User;

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
