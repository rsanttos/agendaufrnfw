package agendaufrnfw.ufrn.imd.pds.main;

import java.util.ArrayList;
import java.util.List;

import agendaufrnfw.ufrn.imd.pds.model.calendar.Commitment;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Evaluation;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Task;

public class Main {

	public static void main(String[] args) {
		List<Commitment> cs = new ArrayList<Commitment>();
		Task t = new Task();
		Evaluation e = new Evaluation();
		cs.add(e);
		cs.add(t);
	}

}
