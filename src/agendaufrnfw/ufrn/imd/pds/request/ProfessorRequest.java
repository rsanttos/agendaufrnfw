package agendaufrnfw.ufrn.imd.pds.request;

public class ProfessorRequest extends GenericRequest {
	public ProfessorRequest() {

	}
	
	public String getEvaluationsAndTasksProfessorLoggedIn(String token) {
		url = String.format("/professor/%s", token);
		String resultado = super.objectRequest();
		return resultado;
	}
}
