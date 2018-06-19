package agendaufrnfw.ufrn.imd.pds.model.calendar.factory;

import agendaufrnfw.ufrn.imd.pds.model.calendar.Commitment;

public interface CommitmentFactory {

	public Commitment createCommitment();
	
	public Commitment createCommitmentFromJson(String json);

}
