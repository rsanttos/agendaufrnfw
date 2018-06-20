package agendaufrnfw.ufrn.imd.pds.model.user;

import java.util.List;

import agendaufrnfw.ufrn.imd.pds.model.calendar.DayWithoutWork;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Meeting;
import agendaufrnfw.ufrn.imd.pds.model.calendar.StudyGroup;

public class GraduateStudent extends Student {

	private List<Meeting> meetings;
	private List<StudyGroup> studiesGroup;
	private List<DayWithoutWork> daysWithoutwork;

	public GraduateStudent() {
		super();
	}

	public GraduateStudent(List<Meeting> meetings, List<StudyGroup> studiesGroup,
			List<DayWithoutWork> daysWithoutwork) {
		super();
		this.meetings = meetings;
		this.studiesGroup = studiesGroup;
		this.daysWithoutwork = daysWithoutwork;
	}

	public List<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(List<Meeting> meetings) {
		this.meetings = meetings;
	}

	public List<StudyGroup> getStudiesGroup() {
		return studiesGroup;
	}

	public void setStudiesGroup(List<StudyGroup> studiesGroup) {
		this.studiesGroup = studiesGroup;
	}

	public List<DayWithoutWork> getDaysWithoutwork() {
		return daysWithoutwork;
	}

	public void setDaysWithoutwork(List<DayWithoutWork> daysWithoutwork) {
		this.daysWithoutwork = daysWithoutwork;
	}

}
