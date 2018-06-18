package agendaufrnfw.ufrn.imd.pds.request;

public class CalendarRequest extends GenericRequest {
    public String getCalendar(){
        url = String.format("/calendar");
        String resultado = super.objectRequest();
        return resultado;
    }
}
