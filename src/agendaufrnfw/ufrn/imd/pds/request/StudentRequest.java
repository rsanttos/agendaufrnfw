package agendaufrnfw.ufrn.imd.pds.request;

public class StudentRequest extends GenericRequest {
	public StudentRequest() {

	}

	public String getEvaluationsAndTasksUndergraduateStudentLoggedIn(String token) {
		url = String.format("/student/undergraduate/full/%s", token);
		String resultado = super.objectRequest();
		return resultado;
	}


	public String getEvaluationsAndTasksGraduateStudentLoggedIn(String token) {
		url = String.format("/student/graduate/full/%s", token);
		String resultado = super.objectRequest();
		return resultado;
	}
}
