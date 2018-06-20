package agendaufrnfw.ufrn.imd.pds.model.user;

import java.util.List;

import agendaufrnfw.ufrn.imd.pds.model.calendar.StudyGroup;

public class UndergraduateStudent extends Student {

	private List<StudyGroup> studiesGroup;

	public UndergraduateStudent() {
		super();
	}

	public List<StudyGroup> getStudiesGroup() {
		return studiesGroup;
	}

	public void setStudiesGroup(List<StudyGroup> studiesGroup) {
		this.studiesGroup = studiesGroup;
	}
	
	
}
