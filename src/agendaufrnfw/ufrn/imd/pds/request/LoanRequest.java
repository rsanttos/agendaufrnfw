package agendaufrnfw.ufrn.imd.pds.request;

public class LoanRequest extends GenericRequest {
    public LoanRequest(){
    }

    public String getStudentLoans(String cpf, String token){
        url = String.format("/student/loans/%s/%s", cpf, token);
        String resultado = super.objectRequest();
        return resultado;
    }
}
