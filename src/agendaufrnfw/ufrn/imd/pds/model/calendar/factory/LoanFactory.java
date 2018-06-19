package agendaufrnfw.ufrn.imd.pds.model.calendar.factory;

import agendaufrnfw.ufrn.imd.pds.dto.LoanDTO;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Commitment;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Loan;

public class LoanFactory implements CommitmentFactory {

	@Override
	public Commitment createCommitment() {
		return new Loan();
	}

	@Override
	public Commitment createCommitmentFromJson(String json) {
		LoanDTO lDto = new LoanDTO();
		return lDto.toObject(json);
	}

}
