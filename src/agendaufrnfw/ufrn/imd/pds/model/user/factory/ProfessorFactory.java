package agendaufrnfw.ufrn.imd.pds.model.user.factory;

import java.util.ArrayList;
import java.util.List;

import agendaufrnfw.ufrn.imd.pds.dto.ClassDTO;
import agendaufrnfw.ufrn.imd.pds.dto.ProfessorDTO;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Commitment;
import agendaufrnfw.ufrn.imd.pds.model.user.Professor;
import agendaufrnfw.ufrn.imd.pds.model.user.User;

public class ProfessorFactory implements UserFactory {

	Professor p = new Professor();
	
	@Override
	public User createUser() {
		return p;
	}

	@Override
	public User createUserFromJson(String json) {
		ProfessorDTO pDto = new ProfessorDTO();
		p = pDto.toObject(json);
		populateUserCommitments();
		return p;
	}

	@Override
	public void populateUserCommitments() {
		List<Commitment> commitments = new ArrayList<Commitment>();
		for(ClassDTO c : p.getClasses()) {
			commitments.addAll(c.getTasks());
			commitments.addAll(c.getEvaluations());
		}		
		commitments.addAll(p.getMeetings());
		commitments.addAll(p.getOrientationMeetings());
		p.setCommitments(commitments);
	}
}
