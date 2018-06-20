package agendaufrnfw.ufrn.imd.pds.model.calendar;

public class ProfessorCalendar extends CalendarUFRN {

	private long inicio_matricula_online;
	private long inicio_periodo;
	private long fim_matricula_online;
	private long fim_periodo;

	public ProfessorCalendar() {
		super();
	}

	public long getInicio_matricula_online() {
		return inicio_matricula_online;
	}

	public void setInicio_matricula_online(long inicio_matricula_online) {
		this.inicio_matricula_online = inicio_matricula_online;
	}

	public long getInicio_periodo() {
		return inicio_periodo;
	}

	public void setInicio_periodo(long inicio_periodo) {
		this.inicio_periodo = inicio_periodo;
	}

	public long getFim_matricula_online() {
		return fim_matricula_online;
	}

	public void setFim_matricula_online(long fim_matricula_online) {
		this.fim_matricula_online = fim_matricula_online;
	}

	public long getFim_periodo() {
		return fim_periodo;
	}

	public void setFim_periodo(long fim_periodo) {
		this.fim_periodo = fim_periodo;
	}

}
