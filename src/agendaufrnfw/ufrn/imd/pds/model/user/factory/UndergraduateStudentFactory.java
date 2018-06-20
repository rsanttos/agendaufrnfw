package agendaufrnfw.ufrn.imd.pds.model.user.factory;

import java.util.ArrayList;
import java.util.List;

import agendaufrnfw.ufrn.imd.pds.dto.UndergraduateStudentDTO;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Commitment;
import agendaufrnfw.ufrn.imd.pds.model.user.UndergraduateStudent;
import agendaufrnfw.ufrn.imd.pds.model.user.User;

public class UndergraduateStudentFactory implements UserFactory {

	UndergraduateStudent ugs = new UndergraduateStudent();

	@Override
	public User createUser() {
		return ugs;
	}

	@Override
	public User createUserFromJson(String json) {
		UndergraduateStudentDTO ugsDto = new UndergraduateStudentDTO();
		ugs = ugsDto.toObject(json);
		populateUserCommitments();
		return ugs;
	}

	@Override
	public void populateUserCommitments() {
		List<Commitment> cs = new ArrayList<Commitment>();
		cs.addAll(ugs.getStudiesGroup());
		ugs.setCommitments(cs);
	}

}
