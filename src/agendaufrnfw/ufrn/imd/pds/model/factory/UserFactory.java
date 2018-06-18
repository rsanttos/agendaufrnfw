package agendaufrnfw.ufrn.imd.pds.model.factory;

import agendaufrnfw.ufrn.imd.pds.model.User;

public interface UserFactory {

	public User createUser();
	
	public User createUserFromJson(String json);
}
