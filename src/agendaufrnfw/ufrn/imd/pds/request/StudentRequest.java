package agendaufrnfw.ufrn.imd.pds.request;

public class StudentRequest extends GenericRequest {
	public StudentRequest() {

	}

	public String getEvaluationsAndTasksStudentLoggedIn(String token) {
		url = String.format("/student/undergraduate/full/%s", token);
		String resultado = super.objectRequest();
		return resultado;
	}
}
