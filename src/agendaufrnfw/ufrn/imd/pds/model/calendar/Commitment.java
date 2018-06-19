package agendaufrnfw.ufrn.imd.pds.model.calendar;

public abstract class Commitment {
	private long finalDate;

	public long getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(long finalDate) {
		this.finalDate = finalDate;
	}
}
