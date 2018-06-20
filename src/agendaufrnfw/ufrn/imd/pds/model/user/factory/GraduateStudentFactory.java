package agendaufrnfw.ufrn.imd.pds.model.user.factory;

import java.util.ArrayList;
import java.util.List;

import agendaufrnfw.ufrn.imd.pds.dto.GraduateStudentDTO;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Commitment;
import agendaufrnfw.ufrn.imd.pds.model.user.GraduateStudent;
import agendaufrnfw.ufrn.imd.pds.model.user.User;

public class GraduateStudentFactory implements UserFactory {

	GraduateStudent gs = new GraduateStudent();

	@Override
	public User createUser() {
		return gs;
	}

	@Override
	public User createUserFromJson(String json) {
		GraduateStudentDTO gsDto = new GraduateStudentDTO();
		gs = gsDto.toObject(json);
		populateUserCommitments();
		return gs;
	}

	@Override
	public void populateUserCommitments() {
		List<Commitment> cs = new ArrayList<Commitment>();
		cs.addAll(gs.getDaysWithoutwork());
		cs.addAll(gs.getMeetings());
		cs.addAll(gs.getStudiesGroup());
		gs.setCommitments(cs);
	}

}
