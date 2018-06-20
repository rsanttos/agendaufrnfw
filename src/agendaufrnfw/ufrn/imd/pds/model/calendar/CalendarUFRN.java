package agendaufrnfw.ufrn.imd.pds.model.calendar;

public abstract class CalendarUFRN {
	
	private int ano;

	private Holiday[] holidays;

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Holiday[] getHolidays() {
		return holidays;
	}

	public void setHolidays(Holiday[] holidays) {
		this.holidays = holidays;
	}
}
